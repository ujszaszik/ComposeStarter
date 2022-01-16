package hu.ujszaszik.composestarter.application

import androidx.hilt.work.HiltWorkerFactory
import androidx.work.Configuration
import com.jakewharton.threetenabp.AndroidThreeTen
import dagger.hilt.android.HiltAndroidApp
import hu.ujszaszik.composestarter.BuildConfig
import hu.ujszaszik.composestarter.network.NetworkUtil
import timber.log.Timber
import javax.inject.Inject

@HiltAndroidApp
class Application : android.app.Application(), Configuration.Provider {

    @Inject
    lateinit var workerFactory: HiltWorkerFactory

    @Inject
    lateinit var networkUtil: NetworkUtil

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
        AndroidThreeTen.init(this)
        networkUtil.registerNetworkCallback()
    }

    override fun getWorkManagerConfiguration(): Configuration {
        return Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .build()
    }
}