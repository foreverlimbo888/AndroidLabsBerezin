package patients

fun main()
{
    val Ilya = Boy(Patient.BloodGroups.GroupI,true,false)
    val JaMorant = Boy(Patient.BloodGroups.GroupII,false,true)
    val Sergio = Boy(Patient.BloodGroups.GroupIII, true, true)
    val Danil = Boy(Patient.BloodGroups.GroupIV, false,false)
    val boys = listOf(Ilya,JaMorant,Sergio,Danil)

    for(i in boys.indices)
    {
        boys[i].patientInfo()
    }

    boys.forEach{
        it.whatRhFactor()
    }

}