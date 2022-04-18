package com.example.demo;

import com.example.demo.util.GetResultStringUtil;

import java.util.Arrays;
import java.util.List;

public class DeleteStringClass extends ResultStringClass {

    private String result;
    private int start=0;
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
     void showResultSting(String tempString) {
         String[] paraStr = {tempString};
        List<String> dataStringList = Arrays.asList(tempString.split(""));

        dataStringList.stream().anyMatch(tempStr ->{

            String result= GetResultStringUtil.getNext(dataStringList,tempStr,dataStringList.indexOf(tempStr));
            if(result.length()>2){
                start=0;
                paraStr[0] = paraStr[0].replaceAll(result,"");
                this.result= paraStr[0];
                return true;
            }else{
                start++;
                return false;
            }
        });

        if(paraStr[0].length()>2 && start<paraStr[0].length()){
            showResultSting(paraStr[0]);
        }


    }

    @Override
    public String toString() {
        return "deleteStringClass{" +
                "result='" + result + '\'' +
                '}';
    }
}
