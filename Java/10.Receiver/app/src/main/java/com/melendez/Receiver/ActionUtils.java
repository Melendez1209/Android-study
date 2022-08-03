package com.melendez.Receiver;

public interface ActionUtils {

    //广播注册与发送时，唯一标识。必须保持一致，（给动态注册使用）
    String ACTION_EQUES_UPDATE_IP = "com.melendez.receiver_ip_";

    //广播注册与发送时，唯一标识。必须保持一致，（给静态注册使用）
    String ACTION_FLAG = "com.melendez.receiver_flag_";

}
