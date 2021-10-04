package org.sussanacode.daggerapplication.model

import android.util.Log
import javax.inject.Inject

//dagger will create a constructor with an object of remote datasource
class DataRepository  @Inject constructor(remoteDataSource: RemoteDataSource) {


    init {
        Log.d("Remote Datasource", remoteDataSource.toString())
    }




}