package com.centerpoint.connect.di

import com.centerpoint.connect.BuildConfig
import com.centerpoint.connect.api.Apis
import com.centerpoint.connect.repository.*
import com.centerpoint.connect.repository.implementation.*
import com.centerpoint.connect.ui.global.service_info.parent.ServiceInfoDetailViewModel
import com.centerpoint.connect.ui.global.service_schedule.ServicesViewModel
import com.centerpoint.connect.ui.global.start_day.StartDayViewModel
import com.centerpoint.connect.ui.global.ticket_info.TicketInfoViewModel
import com.centerpoint.connect.ui.global.update_profile.UpdateProfileViewModel
import com.centerpoint.connect.ui.landing.login.LoginViewModel
import com.centerpoint.connect.util.EncryptSharedPref
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val sharedPrefModule = module {
    single { createMasterKey(androidContext()) }
    single { creteEncryptedSharedPref(androidContext(), get()) }
    single { EncryptSharedPref(get()) }
}

val networkModule = module {
    single { createOkHttpClient() }
    single { createRetrofit(get(), BuildConfig.BASE_URL) }
    single { createAllNewsApi(get()) }
}

val loginModule = module {
    single { LoginRepositoryImpl(get() as Apis) as LoginRepository }
    viewModel { LoginViewModel(get(), get()) }
}

val servicesModule = module {
    single { ServicesRepositoryImpl(get() as Apis) as ServicesRepository }
    viewModel { ServicesViewModel(get(), get()) }
}

val updateProfileModule = module {
    single { UpdateProfileRepositoryImpl(get() as Apis) as UpdateProfileRepository }
    viewModel { UpdateProfileViewModel(get(), get()) }
}

val startDayModule = module {
    single { AttendanceRepositoryImpl(get() as Apis) as AttendanceRepository }
    viewModel { StartDayViewModel(get(), get()) }
}

val ticketInfoModule = module {
    single { TicketInfoRepositoryImpl(get() as Apis) as TicketInfoRepository }
    viewModel { TicketInfoViewModel(get(), get()) }
}

val serviceInfoDetailModule = module {
    single { ServiceInfoDetailRepositoryImpl(get() as Apis) as ServiceInfoDetailRepository }
    viewModel { ServiceInfoDetailViewModel(get(), get()) }
}