package by.stress.pvt.android.lessons.cw9

import by.stress.pvt.android.lessons.cw9.entity.NetProvider


fun provideCarRepository(): CarRepository {

    return  CarRepositoryRemote(
        NetProvider.provideApi((
                NetProvider.provideRetrofit(
                    "http://",
                    NetProvider.provideOkHttp(),
                    NetProvider.provideGson()
                )

            )
        )

    )
}

class RepositoryProvider {
}