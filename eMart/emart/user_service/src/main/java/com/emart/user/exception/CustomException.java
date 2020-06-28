package com.emart.user.exception;



import java.text.MessageFormat;

import com.emart.user.common.ResultCode;

/**
 * 自定义异常类型
 * @author wenhongpeng
 **/
public class CustomException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4917831749163753895L;
	
	//错误代码
    ResultCode resultCode;

    public CustomException(ResultCode resultCode){
        super(resultCode.message());
        this.resultCode = resultCode;
    }

    public CustomException(ResultCode resultCode, Object... args){
        super(resultCode.message());
        String message = MessageFormat.format(resultCode.message(), args);
        resultCode.setMessage(message);
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode(){
        return resultCode;
    }

}
