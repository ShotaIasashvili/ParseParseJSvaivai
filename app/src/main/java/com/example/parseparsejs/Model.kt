package example.javatpoint.com.kotlinjsonparsing

public class Model{
    lateinit var id:String
    lateinit var projectId:String
    lateinit var equipmentId:String
    lateinit var status:String
    lateinit var requestedBy:String
    lateinit var acceptedBy:String
    lateinit var author:String
    lateinit var category:String
    lateinit var filters:String
    lateinit var type:String
    lateinit var organization:String
    lateinit var address:String
    lateinit var startDate:String
    lateinit var endDate:String
    lateinit var description:String
    lateinit var prolongDates:String
    lateinit var releaseDates:String
    lateinit var isDummy:String
    lateinit var hasDriver:String
    lateinit var overwriteDate:String
    lateinit var metaInfo:String
    lateinit var warehouseId:String
    lateinit var rentalDescription:String
    lateinit var internalTransportations:String




    constructor(id: String,name:String,ids:String) {
        this.id = id
        this.projectId = name
        this.equipmentId = ids
        this.requestedBy= requestedBy
        this.acceptedBy = acceptedBy
        this.author = author
        this.status = status
        this.category = category
        this.filters = filters
        this.type = type
        this.organization = organization
        this.address = address
        this.startDate = startDate
        this.endDate = endDate
        this.description = description
        this.releaseDates = releaseDates
        this.isDummy = isDummy
        this.hasDriver = hasDriver
        this.overwriteDate = overwriteDate
        this.metaInfo= metaInfo
        this.prolongDates = prolongDates
        this.releaseDates = releaseDates
        this.isDummy= isDummy
        this.hasDriver= hasDriver
        this.overwriteDate= overwriteDate
        this.metaInfo= metaInfo
        this.warehouseId= warehouseId
        this.rentalDescription= rentalDescription
        this.internalTransportations= internalTransportations








    }

    constructor()
}