package com.rtcmodule;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by GOOGLE on 21-Mar-17.
 */

public class RtcModule {

    private Activity activity;
    private int requestcode = 0;


    public  RtcModule() { }
    private RtcModule( Activity activity) { this.activity = activity; }

    public static RtcModule with( Activity activity) { return new RtcModule(activity); }

    public RtcModule setRequestcode( int requestcode) {
        this.requestcode = requestcode;
        return this;
    }


    public void execute (){

        Intent intent = new Intent( this.activity, RtcActivity.class) ;
        this.activity.startActivityForResult( intent, requestcode);

    }

}
