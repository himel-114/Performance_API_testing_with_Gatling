package simulations

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class TestAPI extends Simulation {

//  val sessionHeaders = Map("Authorization" , value = "Bearer ${eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJjb20uYXVnbWVkaXgiLCJleHAiOjE5NzUwNTM2NDAsInVpZCI6NTAwLCJybHMiOlsiUFJBQ1RJQ0VfVklERU9fTUFOQUdFUiIsIkFTU0VTU01FTlRfVklERU9fTUFOQUdFUiIsIk5PVEVCVUlMREVSX01BTkFHRVIiLCJQSElfVklFV0VSIl19.yjnQqcp4Qe6z-6M3soI8GpexqfAqTAuCf6cDIceYvRc}",
//    "Content-Type" -> "application/json")

  val httpconf = http.baseUrl("https://dev2.augmedix.com:50012")
    .header("Accept",value = "application/json")
    .header("Authorization", value = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJjb20uYXVnbWVkaXgiLCJleHAiOjE5NzUwNTM2NDAsInVpZCI6NTAwLCJybHMiOlsiUFJBQ1RJQ0VfVklERU9fTUFOQUdFUiIsIkFTU0VTU01FTlRfVklERU9fTUFOQUdFUiIsIk5PVEVCVUlMREVSX01BTkFHRVIiLCJQSElfVklFV0VSIl19.yjnQqcp4Qe6z-6M3soI8GpexqfAqTAuCf6cDIceYvRc")

  val scn = scenario("login_test")

      .exec(http("get_alerts")
      .get("/allergies?noteId=829014")
      
      .check(status is 200)
      )
//    .exec(http("create_widget")
//      .post("/allergies?noteId=829014")
//      .headers(sessionHeaders)
//      .body(StringBody("""{"description":"This is just a sample description.","name":"Junk"}"""))
//      .check(jsonPath("$..id").exists.saveAs("newWidgetId"))
//    )

  setUp(scn.inject(atOnceUsers(10))).protocols(httpconf)

//  val httpconf = http.baseUrl("https://dev2.augmedix.com:50012")
//    .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJjb20uYXVnbWVkaXgiLCJleHAiOjE5NzUwNTM2NDAsInVpZCI6NTAwLCJybHMiOlsiUFJBQ1RJQ0VfVklERU9fTUFOQUdFUiIsIkFTU0VTU01FTlRfVklERU9fTUFOQUdFUiIsIk5PVEVCVUlMREVSX01BTkFHRVIiLCJQSElfVklFV0VSIl19.yjnQqcp4Qe6z-6M3soI8GpexqfAqTAuCf6cDIceYvRc")
//  val scn=scenario("check Correction and extract data")
//    .exec(http("get all users")
//      .get("/allergies?noteId=829014")
//      .check(jsonPath {
//        $["dataList"][0]["id"]
//      }.saveAs("userID")))
//
//    .exec(http("Get specific user")
//    .get(s"""/allergies?noteId=829014/$userID""")
//    .check(jsonPath {
//      $.dataList[0].id
//    }.is("AllergyIntolerance-7028"))
//    .check(jsonPath {
//      $.dataList[0].allergyCode
//    }.is("1191"))
//    .check(jsonPath {
//      $.dataList[0].allergen
//    }.is("aspirin")))


  //http conf
//  val httpconf: HttpProtocolBuilder = http.baseUrl("https://dev2.augmedix.com:50012")


////    .header("Accept",value = "application/json")
////    .header("content-type",value = "application/json")
//  val sessionHeaders = Map("Authorization" -> "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJjb20uYXVnbWVkaXgiLCJleHAiOjE5NzUwNTM2NDAsInVpZCI6NTAwLCJybHMiOlsiUFJBQ1RJQ0VfVklERU9fTUFOQUdFUiIsIkFTU0VTU01FTlRfVklERU9fTUFOQUdFUiIsIk5PVEVCVUlMREVSX01BTkFHRVIiLCJQSElfVklFV0VSIl19.yjnQqcp4Qe6z-6M3soI8GpexqfAqTAuCf6cDIceYvRc",
//  "Content-Type" -> "application/json")
//
////  val sessionHeaders = Map(.header("Authorization",  value = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJjb20uYXVnbWVkaXgiLCJleHAiOjE5NzUwNTM2NDAsInVpZCI6NTAwLCJybHMiOlsiUFJBQ1RJQ0VfVklERU9fTUFOQUdFUiIsIkFTU0VTU01FTlRfVklERU9fTUFOQUdFUiIsIk5PVEVCVUlMREVSX01BTkFHRVIiLCJQSElfVklFV0VSIl19.yjnQqcp4Qe6z-6M3soI8GpexqfAqTAuCf6cDIceYvRc"))
////
////
//
//
//
//
//  //scenario
//  protected val scn: ScenarioBuilder =   scenario("get user")
//    .exec(http("get user request")
//      .get("/allergies?noteId=829014")
//      .headers(sessionHeaders)
//      .check(jsonPath("code").exists.saveAs("000"))
//      .check(status is 200))
//
//
//  //setup
//  setUp(scn.inject(atOnceUsers(1))).protocols(httpconf)

}