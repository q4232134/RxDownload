package zlc.season.rxdownload3.database

import io.reactivex.Maybe
import zlc.season.rxdownload3.core.Mission
import zlc.season.rxdownload3.core.RealMission
import zlc.season.rxdownload3.core.Status


interface DbActor {

    fun init()

    fun isExists(mission: RealMission): Boolean

    fun create(mission: RealMission)

    fun read(mission: RealMission)

    fun update(mission: RealMission)

    fun updateStatus(mission: RealMission)

    fun onTransformStatus(status: Status): Int

    fun getStatus(mission: RealMission):Int?

    fun delete(mission: RealMission)

    fun getAllMission(): Maybe<List<Mission>>
}