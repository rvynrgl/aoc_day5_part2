fun main() {
    println("Hello, new world\n")
 
    var seed:Long
    var emptyArray = longArrayOf()
    var emptyArr = arrayListOf<Long>()
    
    var x:Long = 3876866151
    //var ind = 0

    for(t in 3876866151..3876966151 step 1){
        x += 1
        emptyArr.add(x)
    }

    for (sd in emptyArr){
        //ind++
        seed = sd

        /***seed to soil***/
        val ssRange = 
        longArrayOf(240111965,1057221520,141789716,430196980,49125971,5525473,43717600,251589235,563435442,
                    438548691,8091276,892701921,118910618)
        val ssDestination = 
        longArrayOf(2328388605,3183744888,0,886579086,141789716,881053613,3131936012,629464378,2568500570,
                    190915687,3175653612,1435686684,1316776066)   
        val ssSource = 
        longArrayOf(1716277852,3056742994,1574488136,0,2525350732,1956389817,3013025394,1322898901,1961915290,
                    2574476703,4113964514,430196980,4122055790)  
                    
        var gtSource:Boolean
        var ltMaxSource:Boolean
        var srMax:Long
        var map:Long
        var ifRange:Long
        var ssIndex = 0
        var ssToSf:Long = 0
        var sfIndex = 0
        var sfToFw:Long = 0
        var fwIndex = 0
        var fwToWl:Long = 0
        var wlIndex = 0
        var wlToLt:Long = 0
        var ltIndex = 0
        var ltToTh:Long = 0
        var thIndex = 0
        var thToHl:Long = 0
        var hlIndex = 0
        var hlToHl:Long = 0
    
        //sourcerange max = (source + range) - 1
        //map = (seed - source) + destination
    
        for (ssr in ssRange){
            ssIndex++
            srMax = ((ssSource[ssIndex-1]+ssRange[ssIndex-1])-1)
            map = (seed-ssSource[ssIndex-1])+ssDestination[ssIndex-1]
    
            if(seed >= ssSource[ssIndex-1]){
                gtSource = true
            }
            else{
                gtSource = false
            }
    
            if(seed <= srMax){
                ltMaxSource = true
            }
            else{
                ltMaxSource = false
            }
    
            if(gtSource && ltMaxSource){
                ifRange = map
            }
            else{
                ifRange = 0
            }
            ssToSf += ifRange
        }
        if(ssToSf == 0L){
            ssToSf = seed
        }
    
    
    
        /***soil to fertilizer***/
        val sfRange = 
        longArrayOf(159395290,81823607,283153025,213620609,221560020,253212372,177009495,352243190,69683826,56026212,
                    152347638,170678435,315360087,318352157,369020122,177428348,61430609,2862818,21637270,348216679
                    ,99963458)
        val sfDestination = 
        longArrayOf(0,1690371026,1942873068,702170285,477747447,1284811016,2226026093,3187826244,4225283470,2970405965
                   ,1538023388,1772194633,3540069434,159395290,915790894,2792977617,3026432177,699307467,3855429521,3877066791,
                   3087862786)   
        val sfSource = 
        longArrayOf(847324382,1633839702,561308539,347687930,1412279682,1006719672,170678435,2792977617,3206651416,3691658787
                    ,1259932044,0,3376298700,2084683431,1715663309,4117538948,3145220807,844461564,3747684999,3769322269,
                    3276335242)   
    
        for(sfr in sfRange){
            sfIndex++
            srMax = ((sfSource[sfIndex-1]+sfRange[sfIndex-1])-1)
            map = (ssToSf-sfSource[sfIndex-1])+sfDestination[sfIndex-1]
    
            if(ssToSf >= sfSource[sfIndex-1]){
                gtSource = true
            }
            else{
                gtSource = false
            }
    
            if(ssToSf <= srMax){
                ltMaxSource = true
            }
            else{
                ltMaxSource = false
            }
    
            if(gtSource && ltMaxSource){
                ifRange = map
            }
            else{
                ifRange = 0
            }
            sfToFw += ifRange
        }
        if(sfToFw == 0L){
            sfToFw = ssToSf
            if(sfToFw == 0L){
                sfToFw = seed
            }
        }
    
    
        
        /***fertilizer to water***/
        val fwRange = 
        longArrayOf(68123328,40068724,215171709,18066809,121218972,26944785,7968982,1995753,62164110,152557237
                    ,151571624,146770000,51939586,174970461,8530918,9616809,86095809,82490275,30553919,66799704
                    ,20637968,52274235,31671137,1360663,85652641,92676796,235493442,44836629,376901737,36654827
                    ,167027368,27331413,63025182,420788679,216835241,21340999,72640748,331355578,25713425,31936983
                    ,31812673,13546872,17936474,69226504,21370712,190546399,4222323,12588797)
        val fwDestination = 
        longArrayOf(1957494254,3668612865,435525860,417459051,3249874551,3537356195,409490069,3247878798,152557237,0
                    ,3740494262,4127559328,2244919185,1782523793,829840892,3415930152,3451260386,650697569,1725834205,2298219434
                    ,4274329328,2025617582,3564300980,2296858771,3162226157,1564565599,3892065886,3371093523,1187663862,1689179378
                    ,2077891817,2365019138,2678412296,2741437478,2461577055,787129181,3595972117,838371810,3425546961,1657242395
                    ,3708681589,1756388124,1169727388,2392350551,808470180,218943670,214721347,1769934996)   
        val fwSource = 
        longArrayOf(3160765597,2055686861,0,715121035,2634587998,3926770979,215171709,2456653359,570466650,223140691
                    ,3322870672,2467180030,2003747275,2281682898,2458649112,2819793210,2162555289,632630760,787129181,2095755585
                    ,2613950030,4242693061,2248651098,2280322235,4125227747,1911070479,3691277537,1848297376,1437436130,2755806970
                    ,1238471779,2792461797,3953715764,817683100,3474442296,3228888925,3250229924,2829410019,4085967450,1405499147
                    ,4210880388,4111680875,1893134005,4016740946,1826926664,379920251,375697928,1814337867)   
    
        for(fwr in fwRange){
            fwIndex++
            srMax = ((fwSource[fwIndex-1]+fwRange[fwIndex-1])-1)
            map = (sfToFw-fwSource[fwIndex-1])+fwDestination[fwIndex-1]
    
            if(sfToFw >= fwSource[fwIndex-1]){
                gtSource = true
            }
            else{
                gtSource = false
            }
    
            if(sfToFw <= srMax){
                ltMaxSource = true
            }
            else{
                ltMaxSource = false
            }
    
            if(gtSource && ltMaxSource){
                ifRange = map
            }
            else{
                ifRange = 0
            }
            fwToWl += ifRange
        }
        if(fwToWl == 0L){
            fwToWl = sfToFw
            if(fwToWl == 0L){
                fwToWl = ssToSf
                if(fwToWl == 0L){
                    fwToWl = seed
                }
            }
        }
    
    
        
        /***water to light***/
        val wlRange = 
        longArrayOf(83843899,39203216,138464731,173110846,473502117,9248183,11542547,169422772,163549559,3599854
                    ,139503131,141314541,188136758,299761166,82053377,172746664,33664241,163837094,34296064,10986156
                    ,141597020,217188634,6870292,240494284,137484932,121697215,36882618,150612253,59502952,183867373
                    ,31884700,11761598,34146846,31483779,126976373,46155967,67040311,38271406,66149412)
        val wlDestination = 
        longArrayOf(3411019791,1902872961,3968365807,1729762115,3494863690,423365393,2869853730,910597576,609563085,2522382340
                    ,2525982194,131438599,4106830538,2106420951,2406182117,1157660094,97774358,432613576,2835557666,1953837775
                    ,1964823931,2881396277,3404149499,1330406758,773112644,3282452284,2665485325,272753140,0,3098584911
                    ,1570901042,1942076177,2488235494,1080020348,1602785742,1111504127,2768517355,59502952,2702367943)   
        val wlSource = 
        longArrayOf(3038265544,1862724448,2753393749,1614300400,3122109443,445887946,3595611560,2054510840,2589844190,1299215911
                    ,609563085,455136129,3607154107,2290083024,966254850,1302815765,248386611,282050852,1794281538,2043524684
                    ,1901927664,749066216,1787411246,3795290865,4035785149,4173270081,3001382926,97774358,38271406,1115348538
                    ,2938014447,1602538802,1828577602,2969899147,1475562429,2891858480,1048308227,0,2223933612)   
    
        for(wlr in wlRange){
            wlIndex++
            srMax = ((wlSource[wlIndex-1]+wlRange[wlIndex-1])-1)
            map = (fwToWl-wlSource[wlIndex-1])+wlDestination[wlIndex-1]
    
            if(fwToWl >= wlSource[wlIndex-1]){
                gtSource = true
            }
            else{
                gtSource = false
            }
    
            if(fwToWl <= srMax){
                ltMaxSource = true
            }
            else{
                ltMaxSource = false
            }
    
            if(gtSource && ltMaxSource){
                ifRange = map
            }
            else{
                ifRange = 0
            }
            wlToLt += ifRange
    
        }
        if(wlToLt == 0L){
            wlToLt = fwToWl
            if(wlToLt == 0L){
                wlToLt = sfToFw
                if(wlToLt == 0L){
                    wlToLt = ssToSf
                    if(wlToLt == 0L){
                        wlToLt = seed
                    }
                }
            }
        }
    
    
        
        /***light to temperature***/
        val ltRange = 
        longArrayOf(41526915,32531846,45863408,518677185,110737135,207331307,206212717,47363132,126004448,888098871
                    ,66407329,14267512,122576147,840567204,216675148,122926206)
        val ltDestination = 
        longArrayOf(2325040309,3863810956,3695021342,3176344157,2214303174,1166404663,3896342802,216675148,4102555519,264038280
                    ,4228559967,1152137151,3053768010,1373735970,0,3740884750)   
        val ltSource = 
        longArrayOf(318068442,4139509244,4093645836,3053768010,207331307,0,3761428671,359595357,3967641388,406958489
                    ,3572445195,1295057360,3638852524,1526000020,1309324872,4172041090)  
    
        for(ltr in ltRange){
            ltIndex++
            srMax = ((ltSource[ltIndex-1]+ltRange[ltIndex-1])-1)
            map = (wlToLt-ltSource[ltIndex-1])+ltDestination[ltIndex-1]
    
            if(wlToLt >= ltSource[ltIndex-1]){
                gtSource = true
            }
            else{
                gtSource = false
            }
    
            if(wlToLt <= srMax){
                ltMaxSource = true
            }
            else{
                ltMaxSource = false
            }
    
            if(gtSource && ltMaxSource){
                ifRange = map
            }
            else{
                ifRange = 0
            }
            ltToTh += ifRange
    
        }
        if(ltToTh == 0L){
            ltToTh = wlToLt
            if(ltToTh == 0L){
                ltToTh = fwToWl
                if(ltToTh == 0L){
                    ltToTh = sfToFw
                    if(ltToTh == 0L){
                        ltToTh = ssToSf
                        if(ltToTh == 0L){
                            ltToTh = seed
                        }
                    }
                }
            }
        }
    
    
        
        /***temperature to humidity***/
        val thRange = 
        longArrayOf(85308204,31521054,151068785,155052872,53942480,1186202615,650326266)
        val thDestination = 
        longArrayOf(0,3458067104,1325453299,4139914424,1271510819,85308204,3489588158)  
        val thSource = 
        longArrayOf(1391213880,3613119976,1240145095,3458067104,1186202615,0,3644641030)   
    
        for(thr in thRange){
            thIndex++
            srMax = ((thSource[thIndex-1]+thRange[thIndex-1])-1)
            map = (ltToTh-thSource[thIndex-1])+thDestination[thIndex-1]
    
            if(ltToTh >= thSource[thIndex-1]){
                gtSource = true
            }
            else{
                gtSource = false
            }
    
            if(ltToTh <= srMax){
                ltMaxSource = true
            }
            else{
                ltMaxSource = false
            }
    
            if(gtSource && ltMaxSource){
                ifRange = map
            }
            else{
                ifRange = 0
            }
            thToHl += ifRange
    
        }
        if(thToHl == 0L){
            thToHl = ltToTh
            if(thToHl == 0L){
                thToHl = wlToLt
                if(thToHl == 0L){
                    thToHl = fwToWl
                    if(thToHl == 0L){
                        thToHl = sfToFw
                        if(thToHl == 0L){
                            thToHl = ssToSf
                            if(thToHl == 0L){
                                thToHl = seed
                            }
                        }
                    }
                }
            }
        }
    
    
        
        /***humidity to location***/
        val hlRange = 
        longArrayOf(210182350,68802537,80945905,186740639,68491638,111895863,98198983,735862,96257179,32743716
                    ,16690697,116743893,138788533,167312469,477477476,291760467,154765640,8898890,11309757,209661300
                    ,761577,91928196,12214638,149134127,445654795,102540063,214510937,298212139,11794181,43791521
                    ,193123655)
        val hlDestination = 
        longArrayOf(167312469,1429747769,2550869359,1243007130,1735537822,2426758858,1637338839,3109292740,3647611593,3910495658
                    ,3860612665,3743868772,1498550306,0,2631815264,836912419,2271993218,4136363029,377494819,1804029460
                    ,836150842,3110028602,2538654721,687016715,3201956798,1128672886,2057482281,388804576,1231212949,2013690760
                    ,3943239374)   
        val hlSource = 
        longArrayOf(2495357077,3808500825,1829966489,3610450429,990200552,2125855270,2027656287,3306673452,2386885260,3919394548
                    ,3289982755,1910912394,2705539427,1662654020,512723076,1370893553,3307409314,3910495658,3797191068,1058692190
                    ,3517760656,3518522233,2483142439,2237751133,2844327960,1268353490,0,214510937,3505966475,3462174954
                    ,3952138264)   
    
        for(hlr in hlRange){
            hlIndex++
            srMax = ((hlSource[hlIndex-1]+hlRange[hlIndex-1])-1)
            map = (thToHl-hlSource[hlIndex-1])+hlDestination[hlIndex-1]
    
            if(thToHl >= hlSource[hlIndex-1]){
                gtSource = true
            }
            else{
                gtSource = false
            }
    
            if(thToHl <= srMax){
                ltMaxSource = true
            }
            else{
                ltMaxSource = false
            }
    
            if(gtSource && ltMaxSource){
                ifRange = map
            }
            else{
                ifRange = 0
            }
            hlToHl += ifRange
    
            //println("humidity-to-location ~~~ index: $hlIndex map: $map, boolsource: $gtSource, boolmaxsource: $ltMaxSource, ifWithinRange: $ifRange")
        }
        if(hlToHl == 0L){
            hlToHl = thToHl
            if(hlToHl == 0L){
                hlToHl = ltToTh
                if(hlToHl == 0L){
                    hlToHl = wlToLt
                    if(hlToHl == 0L){
                        hlToHl = fwToWl
                        if(hlToHl == 0L){
                            hlToHl = sfToFw
                            if(hlToHl == 0L){
                                hlToHl = ssToSf
                                if(hlToHl == 0L){
                                    hlToHl = seed
                                }
                            }
                        }
                    }
                }
            }
        }
        //println("index: $ind, $hlToHl")
        //println()
        emptyArray += hlToHl
    }
    emptyArray.sort()
    println(emptyArray[0])
}