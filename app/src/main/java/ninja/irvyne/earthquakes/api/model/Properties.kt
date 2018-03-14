package ninja.irvyne.earthquakes.api.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Properties {

    @SerializedName("mag")
    @Expose
    var mag: Double? = null
    @SerializedName("place")
    @Expose
    var place: String? = null
    @SerializedName("time")
    @Expose
    var time: Int? = null
    @SerializedName("updated")
    @Expose
    var updated: Int? = null
    @SerializedName("tz")
    @Expose
    var tz: Int? = null
    @SerializedName("url")
    @Expose
    var url: String? = null
    @SerializedName("detail")
    @Expose
    var detail: String? = null
    @SerializedName("felt")
    @Expose
    var felt: Int? = null
    @SerializedName("cdi")
    @Expose
    var cdi: Int? = null
    @SerializedName("mmi")
    @Expose
    var mmi: Any? = null
    @SerializedName("alert")
    @Expose
    var alert: Any? = null
    @SerializedName("status")
    @Expose
    var status: String? = null
    @SerializedName("tsunami")
    @Expose
    var tsunami: Int? = null
    @SerializedName("sig")
    @Expose
    var sig: Int? = null
    @SerializedName("net")
    @Expose
    var net: String? = null
    @SerializedName("code")
    @Expose
    var code: String? = null
    @SerializedName("ids")
    @Expose
    var ids: String? = null
    @SerializedName("sources")
    @Expose
    var sources: String? = null
    @SerializedName("types")
    @Expose
    var types: String? = null
    @SerializedName("nst")
    @Expose
    var nst: Any? = null
    @SerializedName("dmin")
    @Expose
    var dmin: Double? = null
    @SerializedName("rms")
    @Expose
    var rms: Double? = null
    @SerializedName("gap")
    @Expose
    var gap: Int? = null
    @SerializedName("magType")
    @Expose
    var magType: String? = null
    @SerializedName("type")
    @Expose
    var type: String? = null
    @SerializedName("title")
    @Expose
    var title: String? = null

}