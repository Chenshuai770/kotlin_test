package cs.com.kotlinTest.demo7.delegate

class ResourceID {
    val image_id: String = "101"
    val text_id: String = "102"
}

class ResourceLoader(id:ResourceID){
    val d :ResourceID=id


}