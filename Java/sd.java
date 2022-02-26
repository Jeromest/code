public static void main(String[] args) {
//输入数组，没研究过数独怎么做的，就String了
	String [][] arr = 
		{
				{"0","0","0","1","0","0"}
				,{"3","2","0","0","0","4"}
				,{"6","5","4","3","2","0"}
				,{"0","0","3","4","5","6"}
				,{"4","0","5","0","1","3"}
				,{"1","0","0","0","4","0"}
		}
			;
	//维度，长宽都是六
	int wd = 6;
	for(int i = 0;i < wd ;i++){         //初始化替换0，并按行消除
		String a1 = "123456";
		for(int j = 0;j < wd ;j++){
			a1 = a1.replace(arr[i][j],"");
		}
		for(int j = 0;j < wd ;j++){
			arr[i][j] = arr[i][j].replace("0",a1);
		}
		
	}
	
	fo_line(arr,wd);
	
	
}
 
public static void fo_line(String [][]arr,int wd){
	for(int i = 0;i < wd ;i++){         //按行消
		for(int j = 0;j < wd ;j++){
			if(arr[i][j].length()>1){
				for(int k = 0;k < wd ;k++){
					if(arr[i][k].length()<2 && arr[i][j].length()>1){
						arr[i][j] = arr[i][j].replace(arr[i][k], "");
					}
				}
			}
		}
	}
	
	if(fo_weisu(arr,wd)<1){//如果结果为0，所有元素都为一位
		fo_show(arr,wd);
	}else{
		fo_list(arr,wd);
	}
}
 
public static void fo_list(String [][]arr,int wd){
	for(int i = 0;i < wd ;i++){         //按列消
		String res = "";
		for(int j = 0;j < wd ;j++){
			if(arr[j][i].length()>1){
				for(int k = 0;k < wd ;k++){
					if(arr[k][i].length()<2 && arr[j][i].length()>1){
						arr[j][i] = arr[j][i].replace(arr[k][i], "");
					}
				}
			}
			
		}
	}
	if(fo_weisu(arr,wd)<1){
		fo_show(arr,wd);
	}else{
		fo_line(arr,wd);
	}
}
 
public static int fo_weisu(String [][]arr,int wd) {
	int ws = 0;					//所有元素都为一位 输出0
	for(int i = 0;i < wd ;i++){        
		String res = "";
		for(int j = 0;j < wd ;j++){
			if(arr[i][j].length()>1){
				ws +=1;
			}
		}
	}
	return ws;
}
 
 
public static void fo_show(String [][]arr,int wd) {
	for(int i = 0;i < wd ;i++){     //显示数组    
		String res = "";
		for(int j = 0;j < wd ;j++){
			res += arr[i][j]+" ";			   
		}
		System.out.println(res);
	}
}
