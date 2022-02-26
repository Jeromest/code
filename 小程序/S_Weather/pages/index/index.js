//index.js
//获取应用实例
Page({
  /**
   * 页面的初始数据
   */
  data: {
    region:['陕西省','汉中市','南郑区'],
    now:{
      tmp:0,
      cond_txt:'未知',
      cond_code:'999',
      hum:0,
      pres:0,
      vis:0,
      wind_dir:0,
      wind_spd:0,
      wind_sc:0
    }
  },
  regionChange:function(e){
    this.setData({region:e.detail.value});
    this.getWeather();
  },
  getWeather:function(){
    var that = this;
    wx.request({
      // url: 'https://free-api.heweather.com/s6/weather/now', 
      url: 'https://devapi.heweather.net/s6/weather/now',
      data:{
        location:that.data.region[2],
        // key:'请填入开发者自己申请的和风天气秘钥'
        key:'9a1e63d42cd745748d9f92906f9845b1'        
      },
      success:function(res){
        console.log(res.data);
        that.setData({now:res.data.HeWeather6[0].now});
      }
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.getWeather();
  }
})
