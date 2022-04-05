var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "100",
        "ok": "100",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "2454",
        "ok": "2454",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "5276",
        "ok": "5276",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "3957",
        "ok": "3957",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "779",
        "ok": "779",
        "ko": "-"
    },
    "percentiles1": {
        "total": "3965",
        "ok": "3965",
        "ko": "-"
    },
    "percentiles2": {
        "total": "4630",
        "ok": "4630",
        "ko": "-"
    },
    "percentiles3": {
        "total": "5128",
        "ok": "5128",
        "ko": "-"
    },
    "percentiles4": {
        "total": "5255",
        "ok": "5255",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 100,
    "percentage": 100
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "16.667",
        "ok": "16.667",
        "ko": "-"
    }
},
contents: {
"req_get-alerts-4f925": {
        type: "REQUEST",
        name: "get_alerts",
path: "get_alerts",
pathFormatted: "req_get-alerts-4f925",
stats: {
    "name": "get_alerts",
    "numberOfRequests": {
        "total": "100",
        "ok": "100",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "2454",
        "ok": "2454",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "5276",
        "ok": "5276",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "3957",
        "ok": "3957",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "779",
        "ok": "779",
        "ko": "-"
    },
    "percentiles1": {
        "total": "3965",
        "ok": "3965",
        "ko": "-"
    },
    "percentiles2": {
        "total": "4630",
        "ok": "4630",
        "ko": "-"
    },
    "percentiles3": {
        "total": "5128",
        "ok": "5128",
        "ko": "-"
    },
    "percentiles4": {
        "total": "5255",
        "ok": "5255",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 100,
    "percentage": 100
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "16.667",
        "ok": "16.667",
        "ko": "-"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
