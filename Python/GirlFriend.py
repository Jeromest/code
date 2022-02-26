from wxpy import *
import re

bot = Bot(cache_path=True)  #生成机器人实例，启动缓存避免重复登录

found = bot.friends().search('1一米七三', sex = 1) #在好友列表里搜索名字是“hush”，性别为男的一项

boyfriend = ensure_one(found)   #确保只有一个结果

df_rules = {
    r'^.*在[吗|嘛]': '在呀，在想你呀',
    r'^.+[什么|怎么]安排': '都听你的呀',
    r'^.*B站': '我想了想，不然我们还是分手吧'
}

@bot.register([boyfriend, bot.self], msg_types = TEXT, except_self = True)
def reply_bf(msg):
    for rule in bf_rules:
        if re.match(rule, msg.text):
            try:
                #尝试向发送消息者回复消息
                msg.sender.send_msg(bf_rules[rule])
            except ResponseError as e:
                print(e.err_code, e.err_msg)    #查看错误号和错误消息
            return

    return '我有点笨，能不能迁就一下我，我们说点别的？'

#进入python命令行，让程序保持运行
embed()