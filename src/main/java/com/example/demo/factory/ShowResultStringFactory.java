package com.example.demo.factory;

import com.example.demo.DeleteStringClass;
import com.example.demo.ReplaceStringClass;
import com.example.demo.ResultStringClass;

public class ShowResultStringFactory {


    public  static ResultStringClass getString(String opeationType) throws Exception {
        ResultStringClass resultString=null;


        if(opeationType.equalsIgnoreCase("delete")){
            resultString=new DeleteStringClass();
        }else if(opeationType.equalsIgnoreCase("replace")){
            resultString=new ReplaceStringClass();
        }else {
            throw new Exception("UnknowOpeationType");
        }
        return resultString;


    }



}
