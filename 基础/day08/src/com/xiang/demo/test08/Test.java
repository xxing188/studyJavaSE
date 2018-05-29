package com.xiang.demo.test08;

/**
 * 有如下字符串:"javajfiewjavajfiowfjavagkljjava",定义方法统计出该字符串中"java"字符串的数量
 */
public class Test {
    public static void main(String[] args) {
        String str = "javajfiewjavajfiowfjavagkljjavasdfsjavasdf";
        String ch = "java";
        int count = getCount(str, ch);
        System.out.println(str + "字符串中" + ch + "出现" + count + "次");
    }

    public static int getCount(String str,String ch){
      // 1. 在getCount方法中定义一个int类型变量count，用来记录查找到ch字符串的次数
        int count = 0;

      // 2. 在getCount方法中使用while循环,循环条件是:str.indexOf(ch) != -1
        while (str.indexOf(ch) != -1) {

            // 3. 在while循环里面定义一个int类型变量,用于记录ch字符串在str字符串中的索引
            int star = str.indexOf(ch);
            // 4. 在while循环里面将str字符串从(ch索引位置加ch长度)位置开始截取,截取到str末尾,截取到的新字符串重
            // 新赋值给str变量
            str = str.substring(star + ch.length());

            // 5. 在while循环里面计数器count++
            count++;
        }
      // 6. 返回count
        return count;
    }
}
