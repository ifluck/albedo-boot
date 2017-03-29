package com.albedo.java.util.domain;

/**
 * Application constants.
 */
public final class Globals {

    //Regex for acceptable logins
    public static final String LOGIN_REGEX = "^[_'.@A-Za-z0-9-]*$";
    // Spring profile for development and production, see http://albedo.github.io/profiles/
    public static final String SPRING_PROFILE_DEVELOPMENT = "dev";
    public static final String SPRING_PROFILE_PRODUCTION = "prod";
    // Spring profile used when deploying with Spring Cloud (used when deploying to CloudFoundry)
    public static final String SPRING_PROFILE_CLOUD = "cloud";
    // Spring profile used when deploying to Heroku
    public static final String SPRING_PROFILE_HEROKU = "heroku";
    // Spring profile used to disable swagger
    public static final String SPRING_PROFILE_SWAGGER = "swagger";
    // Spring profile used to disable running liquibase
    public static final String SPRING_PROFILE_NO_LIQUIBASE = "no-liquibase";

    public static final String SYSTEM_ACCOUNT = "system";
    
    
    public static final String INDEX_URL = "index";
    
    public static final String AUTHENTICATED = "authenticated";
	public static final String NO = null;
	
	
	 public static final String ALBEDO_QUARTZENABLED = "albedo.quartzEnabled";
	 
	
	/*** 返回消息状态头 type */
	public static final String MSG_TYPE = "status";
	/*** 返回消息内容头 msg */
	public static final String MSG = "message";
	/*** 返回消息类型 info */
	public static final Integer MSG_TYPE_INFO = 0;
	/*** 返回消息类型 success */
	public static final Integer MSG_TYPE_SUCCESS = 1;
	/*** 返回消息类型 warning */
	public static final Integer MSG_TYPE_WARNING = 2;
	/*** 返回消息类型 error */
	public static final Integer MSG_TYPE_ERROR = -1;
	/*** 返回消息类型 error */
	public static final Integer MSG_TYPE_LOGIN = -99;
	
	
	public static final String RESOURCE_MODULE_DATA_MAP = "RESOURCE_MODULE_DATA_MAP";
	
	
    private Globals() {
    }
}