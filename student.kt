class student (override var name: String, override var age: Int, override var height: Int, override var weight: Int) : Person()
{
private val courses = mutableListof<String>()
fun addcourse (course Name : String)
{
this.courses.add(courseName)
}
fun printcourse ()
{
println("student ${this.name} \n courses :\n ${this.courses.joinToString(separator = "")} \n feature : ")
}