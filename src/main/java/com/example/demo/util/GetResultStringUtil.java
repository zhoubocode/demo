package com.example.demo.util;


import java.util.List;

public  class GetResultStringUtil {


    public static String  getNext(List<String> dataStrList, String dataString, int start){

       String result = "";

        for(int i=start;i<dataStrList.size();i++){
            if(dataStrList.get(i).equals(dataString)){
                result += dataString;
            }else{
                break;
            }
        }
        return result;
    }



    public static String getNextUpEn(String en){

        if(en.equals("a")) return  null;
        char[] c = en.toCharArray();
        if(c.length>1){
            return null;
        }else{
            int now = (int)c[0];
            char uppercase = (char)(now-1);
            return String.valueOf(uppercase);
        }
    }


}
