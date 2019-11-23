package com.smitsworks.toursmodule.model.otpusk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Objects;

/**
 * tours/countries - список стран
 * https://otpusk.api.domain/tours/countries?with=price&access_token=ACCESS_TOKEN
 */
public class Countries {

    /**
     * countries : [{"id":7,"name":"Австралия","nameVn":"Австралию","namePr":"Австралии","iso":"au","iata":"AUL","code":"Australia","visa":"","transport":"air","default":"usd","lat":-28.8447,"lng":135.08791,"zoom":4,"bold":false},{"id":8,"name":"Австрия","nameVn":"Австрию","namePr":"Австрии","iso":"at","iata":"AUS","code":"Austria","visa":"","transport":"air","default":"eur","lat":47.7984,"lng":13.3594,"zoom":6,"bold":true},{"id":6,"name":"Азербайджан","nameVn":"Азербайджан","namePr":"Азербайджане","iso":"az","iata":"AZE","code":"Azerbaijan","visa":"no","transport":"air","default":"usd","lat":40.1513,"lng":47.6899,"zoom":7,"bold":false},{"id":10,"name":"Албания","nameVn":"Албанию","namePr":"Албании","iso":"al","iata":"ALB","code":"Albania","visa":"","transport":"air","default":"eur","lat":41.3438,"lng":20.3796,"zoom":7,"bold":false},{"id":11,"name":"Алжир","nameVn":"Алжир","namePr":"Алжире","iso":"dz","iata":"DZA","code":"Algeria","visa":null,"transport":"air","default":"usd","lat":36.7782,"lng":3.0525,"zoom":12,"bold":false},{"id":3,"name":"Андорра","nameVn":"Андорру","namePr":"Андорре","iso":"ad","iata":"AND","code":"Andorra","visa":"","transport":"air","default":"eur","lat":42.543,"lng":1.5889,"zoom":11,"bold":false},{"id":153,"name":"Антарктика","nameVn":"Антарктику","namePr":"Антарктике","iso":"aa","iata":"ATA","code":"Antarctic","visa":null,"transport":"air","default":"usd","lat":-77.58,"lng":26.1914,"zoom":3,"bold":false},{"id":2,"name":"Антигуа","nameVn":"Антигуа","namePr":"Антигуа","iso":"ag","iata":"ATG","code":"Antigua","visa":"no","transport":"air","default":"usd","lat":46.8151,"lng":30.4321,"zoom":6,"bold":false},{"id":9,"name":"Аргентина","nameVn":"Аргентину","namePr":"Аргентине","iso":"ar","iata":"ARG","code":"argentina","visa":"no","transport":"air","default":"usd","lat":-35.46185,"lng":-65.03758,"zoom":4,"bold":false},{"id":4,"name":"Армения","nameVn":"Армению","namePr":"Армении","iso":"am","iata":"ARM","code":"Armenia","visa":"no","transport":"air","default":"usd","lat":40.313,"lng":45.1648,"zoom":7,"bold":false},{"id":5,"name":"Аруба","nameVn":"Арубу","namePr":"Арубе","iso":"aw","iata":"ABW","code":"Aruba","visa":null,"transport":"air","default":"usd","lat":11.7813,"lng":-64.292,"zoom":5,"bold":false},{"id":143,"name":"Афганистан","nameVn":"Афганистан","namePr":"Афганистане","iso":"af","iata":"AFG","code":"Afghanistan","visa":null,"transport":"air","default":"usd","lat":33.0639,"lng":68.5986,"zoom":5,"bold":false},{"id":18,"name":"Багамы","nameVn":"Багамы","namePr":"Багамах","iso":"bs","iata":"BHS","code":"Bahamas","visa":"","transport":"air","default":"usd","lat":24.3471,"lng":-77.157,"zoom":7,"bold":false},{"id":19,"name":"Бангладеш","nameVn":"Бангладеш","namePr":"Бангладеше","iso":"bd","iata":"BGD","code":"Bangladesh","visa":null,"transport":"air","default":"usd","lat":24.5271,"lng":90.3186,"zoom":6,"bold":false},{"id":12,"name":"Барбадос","nameVn":"Барбадос","namePr":"Барбадосе","iso":"bb","iata":"BRB","code":"Barbados","visa":"no","transport":"air","default":"usd","lat":-48.69,"lng":31.73,"zoom":6,"bold":false},{"id":24,"name":"Бахрейн","nameVn":"Бахрейн","namePr":"Бахрейне","iso":"bh","iata":"BHR","code":"Bahrain","visa":"","transport":"air","default":"usd","lat":26.0383,"lng":50.5824,"zoom":10,"bold":false},{"id":16,"name":"Беларусь","nameVn":"Беларусь","namePr":"Беларуси","iso":"by","iata":"BEL","code":"Belarus","visa":"no","transport":"air","default":"usd","lat":53.7227,"lng":27.9932,"zoom":6,"bold":false},{"id":145,"name":"Белиз","nameVn":"Белиз","namePr":"Белизе","iso":"bz","iata":"BLZ","code":"Belize","visa":null,"transport":"air","default":"usd","lat":-48.69,"lng":31.73,"zoom":6,"bold":false},{"id":17,"name":"Бельгия","nameVn":"Бельгию","namePr":"Бельгии","iso":"be","iata":"BEL","code":"Belgium","visa":"","transport":"air","default":"usd","lat":50.5832,"lng":4.6143,"zoom":6,"bold":false},{"id":20,"name":"Бенин","nameVn":"Бенин","namePr":"Бенине","iso":"bj","iata":"BEN","code":"Benin","visa":null,"transport":"air","default":"usd","lat":9.6441,"lng":2.9443,"zoom":6,"bold":false},{"id":140,"name":"Бермудские острова","nameVn":"Бермуды","namePr":"Бермудах","iso":"bm","iata":"BMU","code":"Bermudas","visa":"","transport":"air","default":"usd","lat":32.2924,"lng":-64.7848,"zoom":13,"bold":false},{"id":13,"name":"Болгария","nameVn":"Болгарию","namePr":"Болгарии","iso":"bg","iata":"BUL","code":"bulgaria","visa":"","transport":"bus","default":"eur","lat":42.7252,"lng":25.4815,"zoom":6,"bold":true},{"id":21,"name":"Боливия","nameVn":"Боливию","namePr":"Боливии","iso":"bo","iata":"BOL","code":"Bolivia","visa":"","transport":"air","default":"usd","lat":-16.2991,"lng":-63.5449,"zoom":5,"bold":false},{"id":22,"name":"Босния и Герцеговина","nameVn":"Боснию и Герцоговину","namePr":"Боснии и Герцоговине","iso":"ba","iata":"BIH","code":"Bosnia-Herzegovina","visa":"no","transport":"air","default":"usd","lat":44.0244,"lng":17.8857,"zoom":6,"bold":false},{"id":23,"name":"Ботсвана","nameVn":"Ботсвану","namePr":"Ботсване","iso":"bw","iata":"BWA","code":"Botswana","visa":null,"transport":"air","default":"usd","lat":-22.5329,"lng":24.3677,"zoom":5,"bold":false},{"id":14,"name":"Бразилия","nameVn":"Бразилию","namePr":"Бразилии","iso":"br","iata":"BRA","code":"Brazil","visa":"","transport":"air","default":"usd","lat":-14.0087,"lng":-54.9316,"zoom":4,"bold":false},{"id":161,"name":"Бруней","nameVn":"Бруней","namePr":"Брунее","iso":"bn","iata":"BWN","code":"Brunei","visa":"no","transport":"air","default":"usd","lat":4.49976,"lng":114.60663,"zoom":10,"bold":false},{"id":15,"name":"Бутан","nameVn":"Бутан","namePr":"Бутане","iso":"bt","iata":"BTN","code":"Butane","visa":null,"transport":"air","default":"usd","lat":27.0885,"lng":90.5383,"zoom":7,"bold":false},{"id":25,"name":"Ватикан","nameVn":"Ватикан","namePr":"Ватикане","iso":"va","iata":"VAT","code":"Vatican","visa":null,"transport":"air","default":"usd","lat":41.8777,"lng":12.5656,"zoom":10,"bold":false},{"id":27,"name":"Великобритания","nameVn":"Великобританию","namePr":"Великобритании","iso":"gb","iata":"GBR","code":"Great Britain","visa":"","transport":"air","default":"eur","lat":54.5721,"lng":-2.5928,"zoom":5,"bold":false},{"id":26,"name":"Венгрия","nameVn":"Венгрию","namePr":"Венгрии","iso":"hu","iata":"HUN","code":"Hungary","visa":"","transport":"air","default":"eur","lat":47.166,"lng":19.5237,"zoom":7,"bold":true},{"id":28,"name":"Венесуэла","nameVn":"Венесуэлу","namePr":"Венесуэле","iso":"ve","iata":"VEN","code":"Venezuela","visa":null,"transport":"air","default":"usd","lat":6.4728,"lng":-66.589,"zoom":5,"bold":false},{"id":29,"name":"Вьетнам","nameVn":"Вьетнам","namePr":"Вьетнаме","iso":"vn","iata":"VNM","code":"vietnam","visa":"","transport":"air","default":"usd","lat":15.2206,"lng":104.3481,"zoom":6,"bold":false},{"id":30,"name":"Гаити","nameVn":"Гаити","namePr":"Гаити","iso":"ht","iata":"HTI","code":"Haiti","visa":"no","transport":"air","default":"usd","lat":18.3858,"lng":-71.3013,"zoom":7,"bold":false},{"id":37,"name":"Гватемала","nameVn":"Гватемалу","namePr":"Гватемале","iso":"gt","iata":"GTM","code":"Guatemala","visa":null,"transport":"air","default":"usd","lat":15.7763,"lng":-90.2323,"zoom":7,"bold":false},{"id":38,"name":"Гвинея","nameVn":"Гвинею","namePr":"Гвинее","iso":"gn","iata":"GIN","code":"Guinea","visa":null,"transport":"air","default":"usd","lat":10.4014,"lng":-10.1514,"zoom":6,"bold":false},{"id":36,"name":"Германия","nameVn":"Германию","namePr":"Германии","iso":"de","iata":"GER","code":"Germany","visa":"","transport":"air","default":"usd","lat":50.7365,"lng":9.3384,"zoom":5,"bold":false},{"id":162,"name":"Гибралтар","nameVn":"Гибралтар","namePr":"Гибралтаре","iso":"gi","iata":"GIB","code":"Gibraltar","visa":null,"transport":"air","default":"usd","lat":36.1559,"lng":-5.34759,"zoom":9,"bold":false},{"id":39,"name":"Гондурас","nameVn":"Гондурас","namePr":"Гондурасе","iso":"hn","iata":"HND","code":"Honduras","visa":null,"transport":"air","default":"usd","lat":14.4879,"lng":-86.7261,"zoom":7,"bold":false},{"id":31,"name":"Гонконг","nameVn":"Гонконг","namePr":"Гонконге","iso":"hk","iata":"HKG","code":"Hong Kong","visa":"","transport":"air","default":"usd","lat":23.11,"lng":113.269,"zoom":7,"bold":false},{"id":35,"name":"Гренада","nameVn":"Гренаду","namePr":"Гренаде","iso":"gd","iata":"GRD","code":"Grenada","visa":null,"transport":"air","default":"usd","lat":12.2608,"lng":-61.5882,"zoom":8,"bold":false},{"id":34,"name":"Греция","nameVn":"Грецию","namePr":"Греции","iso":"gr","iata":"GRE","code":"Greece","visa":"","transport":"air","default":"eur","lat":38.5997,"lng":23.4668,"zoom":6,"bold":true},{"id":33,"name":"Грузия","nameVn":"Грузию","namePr":"Грузии","iso":"ge","iata":"GEO","code":"georgia","visa":"no","transport":"air","default":"usd","lat":42.14711,"lng":43.48389,"zoom":6,"bold":false},{"id":40,"name":"Дания","nameVn":"Данию","namePr":"Дании","iso":"dk","iata":"DNK","code":"Denmark","visa":"","transport":"air","default":"usd","lat":55.1412,"lng":11.4038,"zoom":6,"bold":false},{"id":156,"name":"Джибути","nameVn":"Джибути","namePr":"Джибути","iso":"dj","iata":"DJI","code":"Djibouti","visa":null,"transport":"air","default":"usd","lat":11.6845,"lng":42.7176,"zoom":9,"bold":false},{"id":41,"name":"Доминика","nameVn":"Доминику","namePr":"Доминике","iso":"dm","iata":"DMA","code":"Dominica","visa":"no","transport":"air","default":"usd","lat":15.4167,"lng":-61.3641,"zoom":10,"bold":false},{"id":42,"name":"Доминикана","nameVn":"Доминикану","namePr":"Доминикане","iso":"do","iata":"DOM","code":"dominican republic","visa":"","transport":"air","default":"usd","lat":18.8023,"lng":-70.2905,"zoom":7,"bold":false},{"id":43,"name":"Египет","nameVn":"Египет","namePr":"Египте","iso":"eg","iata":"EGY","code":"egypt","visa":"","transport":"air","default":"usd","lat":26.2934,"lng":30.9814,"zoom":5,"bold":true},{"id":44,"name":"Замбия","nameVn":"Замбию","namePr":"Замбии","iso":"zm","iata":"ZMB","code":"Zambia","visa":null,"transport":"air","default":"usd","lat":-13.3682,"lng":27.8613,"zoom":5,"bold":false},{"id":45,"name":"Зимбабве","nameVn":"Зимбабве","namePr":"Зимбабве","iso":"zw","iata":"ZWE","code":"Zimbabwe","visa":null,"transport":"air","default":"usd","lat":-19.0133,"lng":29.1467,"zoom":6,"bold":false},{"id":52,"name":"Израиль","nameVn":"Израиль","namePr":"Израиле","iso":"il","iata":"ISR","code":"israel","visa":"no","transport":"air","default":"usd","lat":31.3536,"lng":34.9805,"zoom":6,"bold":true},{"id":46,"name":"Индия","nameVn":"Индию","namePr":"Индии","iso":"in","iata":"IND","code":"india","visa":"","transport":"air","default":"usd","lat":21.8411,"lng":79.519,"zoom":5,"bold":true},{"id":47,"name":"Индонезия","nameVn":"Индонезию","namePr":"Индонезии","iso":"id","iata":"INS","code":"indonesia","visa":"","transport":"air","default":"usd","lat":-2.548,"lng":118.0151,"zoom":4,"bold":false},{"id":53,"name":"Иордания","nameVn":"Иорданию","namePr":"Иордании","iso":"jo","iata":"JOR","code":"Jordan","visa":"","transport":"air","default":"usd","lat":31.2768,"lng":37.1306,"zoom":6,"bold":false},{"id":139,"name":"Иран","nameVn":"Иран","namePr":"Иране","iso":"ir","iata":"IRN","code":"Iran","visa":"","transport":"air","default":"usd","lat":32.8057,"lng":54.8877,"zoom":5,"bold":false},{"id":137,"name":"Ирландия","nameVn":"Ирландию","namePr":"Ирландии","iso":"ie","iata":"IRL","code":"Ireland","visa":"","transport":"air","default":"usd","lat":53.2521,"lng":-8.2617,"zoom":7,"bold":false},{"id":51,"name":"Исландия","nameVn":"Исландию","namePr":"Исландии","iso":"is","iata":"ISL","code":"Iceland","visa":"","transport":"air","default":"usd","lat":0,"lng":0,"zoom":0,"bold":false},{"id":49,"name":"Испания","nameVn":"Испанию","namePr":"Испании","iso":"es","iata":"SPA","code":"spain","visa":"","transport":"air","default":"eur","lat":40.38,"lng":-4.8999,"zoom":5,"bold":true},{"id":48,"name":"Италия","nameVn":"Италию","namePr":"Италии","iso":"it","iata":"ITA","code":"italy","visa":"","transport":"air","default":"eur","lat":41.0462,"lng":12.9639,"zoom":6,"bold":true},{"id":142,"name":"Йемен","nameVn":"Йемен","namePr":"Йемене","iso":"ye","iata":"YEM","code":"Yemen","visa":null,"transport":"air","default":"usd","lat":15.623,"lng":47.439,"zoom":6,"bold":false},{"id":159,"name":"Кабо-Верде","nameVn":"Кабо-Верде","namePr":"Кабо-Верде","iso":"cv","iata":"CPV","code":"Cape Verde","visa":"","transport":"air","default":"usd","lat":15.13576,"lng":-23.7085,"zoom":6,"bold":false},{"id":59,"name":"Казахстан","nameVn":"Казахстан","namePr":"Казахстане","iso":"kz","iata":"KAZ","code":"Kazakhstan","visa":"","transport":"air","default":"usd","lat":45.213,"lng":67.1484,"zoom":4,"bold":false},{"id":62,"name":"Камбоджа","nameVn":"Камбоджу","namePr":"Камбодже","iso":"kh","iata":"KHM","code":"Cambodia","visa":"","transport":"air","default":"usd","lat":17.2667,"lng":107.1826,"zoom":5,"bold":false},{"id":66,"name":"Камерун","nameVn":"Камерун","namePr":"Камеруне","iso":"cm","iata":"CMR","code":"Cameroon","visa":null,"transport":"air","default":"usd","lat":3.4696,"lng":14.1064,"zoom":5,"bold":false},{"id":57,"name":"Канада","nameVn":"Канаду","namePr":"Канаде","iso":"ca","iata":"CAN","code":"Canada","visa":"","transport":"air","default":"usd","lat":53.5925,"lng":-99.668,"zoom":4,"bold":false},{"id":166,"name":"Катар","nameVn":"Катар","namePr":"Катаре","iso":"qa","iata":"QAT","code":"katar","visa":"","transport":"air","default":"usd","lat":25.35483,"lng":51.18388,"zoom":8,"bold":false},{"id":60,"name":"Кения","nameVn":"Кению","namePr":"Кении","iso":"ke","iata":"KEN","code":"Kenya","visa":"","transport":"air","default":"usd","lat":0.414,"lng":37.9042,"zoom":6,"bold":false},{"id":54,"name":"Кипр","nameVn":"Кипр","namePr":"Кипре","iso":"cy","iata":"CYP","code":"cyprus","visa":"","transport":"air","default":"eur","lat":35.075,"lng":33.4314,"zoom":8,"bold":true},{"id":61,"name":"Киргизия","nameVn":"Киргизию","namePr":"Киргизии","iso":"kg","iata":"KGZ","code":"Kyrgyzstan","visa":"no","transport":"air","default":"usd","lat":41.4592,"lng":74.729,"zoom":6,"bold":false},{"id":58,"name":"Китай","nameVn":"Китай","namePr":"Китае","iso":"cn","iata":"CHN","code":"China","visa":"","transport":"air","default":"usd","lat":35.1019,"lng":101.4258,"zoom":4,"bold":false},{"id":63,"name":"Колумбия","nameVn":"Колумбию","namePr":"Колумбии","iso":"co","iata":"COL","code":"Colombia","visa":"no","transport":"air","default":"usd","lat":2.6358,"lng":-70.3125,"zoom":5,"bold":false},{"id":64,"name":"Конго","nameVn":"Конго","namePr":"Конго","iso":"cd","iata":"COG","code":"Congo","visa":"","transport":"air","default":"usd","lat":-2.24129,"lng":23.24596,"zoom":5,"bold":false},{"id":154,"name":"Коста Рика","nameVn":"Коста Рику","namePr":"Коста Рике","iso":"cr","iata":"CRI","code":"Costa Rica","visa":null,"transport":"air","default":"usd","lat":9.9333,"lng":-84.0833,"zoom":15,"bold":false},{"id":50,"name":"Крым","nameVn":"Крым","namePr":"Крыме","iso":"uc","iata":"UCM","code":"Crimea","visa":"no","transport":"air","default":"usd","lat":45.5217,"lng":34.4312,"zoom":7,"bold":false},{"id":56,"name":"Куба","nameVn":"Кубу","namePr":"Кубе","iso":"cu","iata":"CUB","code":"Cuba","visa":"","transport":"air","default":"usd","lat":21.5553,"lng":-79.5465,"zoom":6,"bold":false},{"id":65,"name":"Кувейт","nameVn":"Кувейт","namePr":"Кувейте","iso":"kw","iata":"KWT","code":"Kuwait","visa":null,"transport":"air","default":"usd","lat":29.3056,"lng":47.4939,"zoom":7,"bold":false},{"id":146,"name":"Лаос","nameVn":"Лаос","namePr":"Лаосе","iso":"la","iata":"LAO","code":"Laos","visa":null,"transport":"air","default":"usd","lat":18.2058,"lng":103.895,"zoom":11,"bold":false},{"id":67,"name":"Латвия","nameVn":"Латвию","namePr":"Латвии","iso":"lv","iata":"LVA","code":"Latvia","visa":"","transport":"air","default":"eur","lat":56.7888,"lng":25.1038,"zoom":7,"bold":false},{"id":72,"name":"Либерия","nameVn":"Либерию","namePr":"Либерии","iso":"lr","iata":"LBR","code":"Liberia","visa":null,"transport":"air","default":"usd","lat":6.4524,"lng":-9.4286,"zoom":7,"bold":false},{"id":68,"name":"Ливан","nameVn":"Ливан","namePr":"Ливане","iso":"lb","iata":"LBN","code":"Lebanon","visa":"","transport":"air","default":"usd","lat":34.922,"lng":39.1553,"zoom":6,"bold":false},{"id":69,"name":"Литва","nameVn":"Литву","namePr":"Литве","iso":"lt","iata":"LTU","code":"Lithuania","visa":"","transport":"air","default":"usd","lat":55.2541,"lng":23.9941,"zoom":6,"bold":false},{"id":71,"name":"Лихтенштейн","nameVn":"Лихтенштейн","namePr":"Лихтенштейне","iso":"li","iata":"LIE","code":"Liechtenstein","visa":"","transport":"air","default":"usd","lat":47.1595,"lng":9.5538,"zoom":6,"bold":false},{"id":70,"name":"Люксембург","nameVn":"Люксембург","namePr":"Люксембурге","iso":"lu","iata":"LUX","code":"Luxembourg","visa":"","transport":"air","default":"usd","lat":49.8274,"lng":6.3474,"zoom":9,"bold":false},{"id":84,"name":"Маврикий","nameVn":"Маврикий","namePr":"Маврикии","iso":"mu","iata":"MAU","code":"Mauritius","visa":"","transport":"air","default":"eur","lat":-18.9375,"lng":58.9526,"zoom":6,"bold":false},{"id":147,"name":"Мавритания","nameVn":"Мавританию","namePr":"Мавритании","iso":"mr","iata":"MRT","code":"Mauritania","visa":null,"transport":"air","default":"usd","lat":20.7561,"lng":-11.3818,"zoom":5,"bold":false},{"id":74,"name":"Мадагаскар","nameVn":"Мадагаскар","namePr":"Мадагаскаре","iso":"mg","iata":"MDG","code":"Madagascar","visa":"","transport":"air","default":"usd","lat":-18.7772,"lng":46.8376,"zoom":5,"bold":false},{"id":77,"name":"Македония","nameVn":"Македонию","namePr":"Македонии","iso":"mk","iata":"MKD","code":"Macedonia","visa":"","transport":"air","default":"usd","lat":41.6136,"lng":21.743,"zoom":8,"bold":false},{"id":78,"name":"Малайзия","nameVn":"Малайзию","namePr":"Малайзии","iso":"my","iata":"MAL","code":"Malaysia","visa":"no","transport":"air","default":"usd","lat":4.8064,"lng":101.7334,"zoom":6,"bold":false},{"id":79,"name":"Мальдивы","nameVn":"Мальдивы","namePr":"Мальдивах","iso":"mv","iata":"MLD","code":"maldives","visa":"no","transport":"air","default":"usd","lat":3.0308,"lng":73.1909,"zoom":6,"bold":false},{"id":73,"name":"Мальта","nameVn":"Мальту","namePr":"Мальте","iso":"mt","iata":"MLT","code":"Malta","visa":"","transport":"air","default":"eur","lat":35.8863,"lng":14.4134,"zoom":10,"bold":false},{"id":75,"name":"Марокко","nameVn":"Марокко","namePr":"Марокко","iso":"ma","iata":"MOR","code":"Morocco","visa":"","transport":"air","default":"eur","lat":32.1012,"lng":-6.6357,"zoom":5,"bold":false},{"id":80,"name":"Мексика","nameVn":"Мексику","namePr":"Мексике","iso":"mx","iata":"MEX","code":"Mexico","visa":"","transport":"air","default":"usd","lat":24.2069,"lng":-103.0957,"zoom":5,"bold":false},{"id":81,"name":"Мозамбик","nameVn":"Мозамбик","namePr":"Мозамбике","iso":"mz","iata":"MOZ","code":"Mozambique","visa":null,"transport":"air","default":"usd","lat":-17.5812,"lng":33.4204,"zoom":6,"bold":false},{"id":76,"name":"Молдова","nameVn":"Молдову","namePr":"Молдове","iso":"md","iata":"MDA","code":"Moldova","visa":"no","transport":"air","default":"usd","lat":47.1,"lng":28.8281,"zoom":6,"bold":false},{"id":82,"name":"Монако","nameVn":"Монако","namePr":"Монако","iso":"mc","iata":"MCO","code":"Monaco","visa":"","transport":"air","default":"usd","lat":44.9181,"lng":7.4268,"zoom":6,"bold":false},{"id":83,"name":"Монголия","nameVn":"Монголию","namePr":"Монголии","iso":"mn","iata":"MHG","code":"Mongolia","visa":"no","transport":"air","default":"usd","lat":46.8609,"lng":103.837,"zoom":4,"bold":false},{"id":144,"name":"Мьянма","nameVn":"Мьянму","namePr":"Мьянме","iso":"mm","iata":"MMR","code":"Myanmar","visa":null,"transport":"air","default":"usd","lat":20.0559,"lng":96.6797,"zoom":5,"bold":false},{"id":85,"name":"Намибия","nameVn":"Намибию","namePr":"Намибии","iso":"na","iata":"NAM","code":"Namibia","visa":"no","transport":"air","default":"usd","lat":-22.9657,"lng":18.4862,"zoom":5,"bold":false},{"id":86,"name":"Непал","nameVn":"Непал","namePr":"Непале","iso":"np","iata":"NPL","code":"Nepal","visa":"","transport":"air","default":"usd","lat":28.3951,"lng":84.1278,"zoom":6,"bold":false},{"id":87,"name":"Нигер","nameVn":"Нигер","namePr":"Нигере","iso":"ne","iata":"NER","code":"Niger","visa":null,"transport":"air","default":"usd","lat":17.6021,"lng":8.0859,"zoom":5,"bold":false},{"id":88,"name":"Нигерия","nameVn":"Нигерию","namePr":"Нигерии","iso":"ng","iata":"NGA","code":"Nigeria","visa":null,"transport":"air","default":"usd","lat":9.319,"lng":8.2617,"zoom":5,"bold":false},{"id":32,"name":"Нидерланды","nameVn":"Нидерланды","namePr":"Нидерландах","iso":"nl","iata":"NLD","code":"Netherlands","visa":"","transport":"air","default":"eur","lat":52.248,"lng":5.2405,"zoom":7,"bold":false},{"id":89,"name":"Никарагуа","nameVn":"Никарагуа","namePr":"Никарагуа","iso":"ni","iata":"NIC","code":"Nicaragua","visa":"","transport":"air","default":"usd","lat":12.8225,"lng":-84.342,"zoom":7,"bold":false},{"id":90,"name":"Новая Зеландия","nameVn":"Новую Зеландию","namePr":"Новой Зеландии","iso":"nz","iata":"NZL","code":"New Zealand","visa":"","transport":"air","default":"usd","lat":-43.3571,"lng":173.3203,"zoom":6,"bold":false},{"id":91,"name":"Норвегия","nameVn":"Норвегию","namePr":"Норвегии","iso":"no","iata":"NOR","code":"Norway","visa":"","transport":"air","default":"usd","lat":63.7047,"lng":20.7422,"zoom":4,"bold":false},{"id":92,"name":"ОАЭ","nameVn":"ОАЭ","namePr":"ОАЭ","iso":"ae","iata":"ARE","code":"uae","visa":"","transport":"air","default":"usd","lat":24.3871,"lng":54.0527,"zoom":7,"bold":true},{"id":93,"name":"Оман","nameVn":"Оман","namePr":"Омане","iso":"om","iata":"OMN","code":"Oman","visa":"","transport":"air","default":"usd","lat":21.0845,"lng":53.3716,"zoom":6,"bold":false},{"id":94,"name":"Пакистан","nameVn":"Пакистан","namePr":"Пакистане","iso":"pk","iata":"PAK","code":"Pakistan","visa":null,"transport":"air","default":"usd","lat":28.9985,"lng":71.7627,"zoom":5,"bold":false},{"id":95,"name":"Панама","nameVn":"Панаму","namePr":"Панаме","iso":"pa","iata":"PAN","code":"Panama","visa":"","transport":"air","default":"usd","lat":8.2659,"lng":-80.0244,"zoom":7,"bold":false},{"id":131,"name":"Папуа-Новая Гвинея","nameVn":"Папуа-Новую Гвинею","namePr":"Папуа-Новой Гвинее","iso":"pg","iata":"PNG","code":"Papua New Guinea","visa":null,"transport":"air","default":"usd","lat":8.6353,"lng":-80.4858,"zoom":7,"bold":false},{"id":96,"name":"Парагвай","nameVn":"Парагвай","namePr":"Парагвае","iso":"py","iata":"PRY","code":"Paraguay","visa":"no","transport":"air","default":"usd","lat":-23.7652,"lng":-57.7441,"zoom":6,"bold":false},{"id":97,"name":"Перу","nameVn":"Перу","namePr":"Перу","iso":"pe","iata":"PER","code":"Peru","visa":"no","transport":"air","default":"usd","lat":-9.1814,"lng":-75.0024,"zoom":5,"bold":false},{"id":98,"name":"Польша","nameVn":"Польшу","namePr":"Польше","iso":"pl","iata":"POL","code":"Poland","visa":"","transport":"air","default":"eur","lat":51.9036,"lng":19.7974,"zoom":6,"bold":false},{"id":99,"name":"Португалия","nameVn":"Португалию","namePr":"Португалии","iso":"pt","iata":"POR","code":"Portugal","visa":"","transport":"air","default":"eur","lat":39.5718,"lng":-7.8662,"zoom":6,"bold":false},{"id":164,"name":"Пуэрто-Рико","nameVn":"Пуэрто-Рико","namePr":"Пуэрто-Рико","iso":"pr","iata":"SIG","code":"Puerto Rico","visa":null,"transport":"air","default":"usd","lat":18.2417,"lng":-66.09851,"zoom":9,"bold":false},{"id":100,"name":"Россия","nameVn":"Россию","namePr":"России","iso":"ru","iata":"RUS","code":"Russia","visa":"no","transport":"air","default":"usd","lat":63.70472,"lng":94.39453,"zoom":3,"bold":false},{"id":160,"name":"Руанда","nameVn":"Руанду","namePr":"Руанде","iso":"rw","iata":"RWA","code":"Rwanda","visa":null,"transport":"air","default":"usd","lat":0,"lng":0,"zoom":0,"bold":false},{"id":101,"name":"Румыния","nameVn":"Румынию","namePr":"Румынии","iso":"ro","iata":"ROM","code":"romania","visa":"","transport":"air","default":"usd","lat":45.9359,"lng":24.9829,"zoom":6,"bold":false},{"id":167,"name":"Сальвадор","nameVn":"Сальвадор","namePr":"Сальвадоре","iso":"sv","iata":"ESA","code":"el salvador","visa":"","transport":"air","default":"usd","lat":13.79419,"lng":-88.89653,"zoom":8,"bold":false},{"id":102,"name":"Сан Марино","nameVn":"Сан-Марино","namePr":"Сан-Марино","iso":"sm","iata":"SMR","code":"San Marino","visa":"","transport":"air","default":"usd","lat":43.9434,"lng":12.4647,"zoom":12,"bold":false},{"id":103,"name":"Саудовская Аравия","nameVn":"Саудовскую Аравию","namePr":"Саудовской Аравии","iso":"sa","iata":"SAU","code":"Saudi Arabia","visa":null,"transport":"air","default":"usd","lat":23.926,"lng":44.6484,"zoom":5,"bold":false},{"id":150,"name":"Северная Корея","nameVn":"Северную Корею","namePr":"Северной Корее","iso":"kp","iata":"PRK","code":"North Korea","visa":null,"transport":"air","default":"usd","lat":39.935,"lng":127.1448,"zoom":6,"bold":false},{"id":104,"name":"Сейшельские о-ва","nameVn":"Сейшельские о-ва","namePr":"Сейшельских о-вах","iso":"sc","iata":"SEY","code":"seashelles","visa":"no","transport":"air","default":"eur","lat":-4.6202,"lng":55.1514,"zoom":7,"bold":false},{"id":105,"name":"Сенегал","nameVn":"Сенегал","namePr":"Сенегале","iso":"sn","iata":"SEN","code":"Senegal","visa":null,"transport":"air","default":"usd","lat":14.424,"lng":-14.0845,"zoom":7,"bold":false},{"id":141,"name":"Сент-Люсия","nameVn":"Сент-Люсию","namePr":"Сент-Люсию","iso":"lc","iata":"LCA","code":"Saint Lucia","visa":null,"transport":"air","default":"usd","lat":13.9047,"lng":-60.9741,"zoom":8,"bold":false},{"id":138,"name":"Сербия","nameVn":"Сербию","namePr":"Сербии","iso":"rs","iata":"SRB","code":"Serbia","visa":"","transport":"air","default":"usd","lat":44.1349,"lng":20.9619,"zoom":6,"bold":false},{"id":106,"name":"Сингапур","nameVn":"Сингапур","namePr":"Сингапуре","iso":"sg","iata":"SIN","code":"Singapore","visa":"","transport":"air","default":"usd","lat":0.8679,"lng":103.1836,"zoom":7,"bold":false},{"id":107,"name":"Сирия","nameVn":"Сирию","namePr":"Сирии","iso":"sy","iata":"SYR","code":"Syria","visa":"","transport":"air","default":"usd","lat":35.3711,"lng":38.6499,"zoom":6,"bold":false},{"id":108,"name":"Словакия","nameVn":"Словакию","namePr":"Словакии","iso":"sk","iata":"SVK","code":"slovakia","visa":"","transport":"air","default":"eur","lat":48.6619,"lng":19.6216,"zoom":7,"bold":true},{"id":109,"name":"Словения","nameVn":"Словению","namePr":"Словении","iso":"si","iata":"SVN","code":"Slovenia","visa":"","transport":"air","default":"eur","lat":46.1494,"lng":14.9854,"zoom":6,"bold":false},{"id":110,"name":"Сомали","nameVn":"Сомали","namePr":"Сомали","iso":"so","iata":"SOM","code":"Somalia","visa":null,"transport":"air","default":"usd","lat":5.1785,"lng":46.1865,"zoom":5,"bold":false},{"id":111,"name":"США","nameVn":"США","namePr":"США","iso":"us","iata":"USA","code":"USA","visa":"","transport":"air","default":"usd","lat":39.096,"lng":-100.0195,"zoom":3,"bold":false},{"id":165,"name":"Таджикистан","nameVn":"Таджикистан","namePr":"Таджикистане","iso":"tj","iata":"TJS","code":"Tajikistan","visa":"no","transport":"air","default":"usd","lat":38.53957,"lng":68.7616,"zoom":8,"bold":false},{"id":113,"name":"Таиланд","nameVn":"Таиланд","namePr":"Таиланде","iso":"th","iata":"THA","code":"thailand","visa":"","transport":"air","default":"usd","lat":12.9403,"lng":102.085,"zoom":5,"bold":true},{"id":112,"name":"Тайвань","nameVn":"Тайвань","namePr":"Тайване","iso":"tw","iata":"TWN","code":"Taiwan","visa":"","transport":"air","default":"usd","lat":23.6948,"lng":120.9595,"zoom":7,"bold":false},{"id":152,"name":"Танзания","nameVn":"Танзанию","namePr":"Танзании","iso":"tz","iata":"TZA","code":"Tanzania","visa":"","transport":"air","default":"usd","lat":-6.8828,"lng":35.1782,"zoom":6,"bold":false},{"id":163,"name":"Тибет","nameVn":"Тибает","namePr":"Тибете","iso":"tb","iata":"BPX","code":"Tibet","visa":null,"transport":"air","default":"usd","lat":33.17434,"lng":86.85791,"zoom":5,"bold":false},{"id":158,"name":"Тринидад и Тобаго","nameVn":"Тринидад и Тобаго","namePr":"Тринидаде и Тобаго","iso":"tt","iata":"TTO","code":"Trinidad and Tobago","visa":null,"transport":"air","default":"usd","lat":10.4608,"lng":-61.28174,"zoom":8,"bold":false},{"id":114,"name":"Тунис","nameVn":"Тунис","namePr":"Тунисе","iso":"tn","iata":"TUN","code":"tunis","visa":"no","transport":"air","default":"usd","lat":33.7426,"lng":9.8218,"zoom":6,"bold":true},{"id":157,"name":"Туркменистан","nameVn":"Туркменистан","namePr":"Туркменистане","iso":"tm","iata":"TKM","code":"Turkmenistan","visa":null,"transport":"air","default":"usd","lat":39.13858,"lng":59.3811,"zoom":6,"bold":false},{"id":115,"name":"Турция","nameVn":"Турцию","namePr":"Турции","iso":"tr","iata":"TUR","code":"turkey","visa":"no","transport":"air","default":"eur","lat":38.9829,"lng":35.1906,"zoom":5,"bold":true},{"id":117,"name":"Уганда","nameVn":"Уганду","namePr":"Уганде","iso":"ug","iata":"UGA","code":"Uganda","visa":null,"transport":"air","default":"usd","lat":1.5818,"lng":33.1787,"zoom":6,"bold":false},{"id":149,"name":"Узбекистан","nameVn":"Узбекистан","namePr":"Узбекистане","iso":"uz","iata":"UZB","code":"Uzbekistan","visa":"no","transport":"air","default":"usd","lat":41.6565,"lng":64.4238,"zoom":5,"bold":false},{"id":116,"name":"Украина","nameVn":"Украину","namePr":"Украине","iso":"ua","iata":"UKR","code":"ukraine","visa":"no","transport":"no","default":"uah","lat":48.69,"lng":31.73,"zoom":5,"bold":true},{"id":55,"name":"Украина - Карпаты","nameVn":"Карпаты","namePr":"Карпатах","iso":"ur","iata":"UCP","code":"Carpathians","visa":"no","transport":"no","default":"uah","lat":48.9586,"lng":24.4666,"zoom":7,"bold":true},{"id":118,"name":"Уругвай","nameVn":"Уругвай","namePr":"Уругвае","iso":"uy","iata":"URY","code":"Uruguay","visa":null,"transport":"air","default":"usd","lat":-31.2786,"lng":-54.9756,"zoom":6,"bold":false},{"id":1,"name":"Фиджи","nameVn":"Фиджи","namePr":"Фиджи","iso":"fj","iata":"FJI","code":"Fiji","visa":"no","transport":"air","default":"usd","lat":-17.7487,"lng":179.5276,"zoom":7,"bold":false},{"id":120,"name":"Филиппины","nameVn":"Филиппины","namePr":"Филиппинах","iso":"ph","iata":"PHL","code":"Philippines","visa":"","transport":"air","default":"usd","lat":12.8761,"lng":121.7725,"zoom":6,"bold":false},{"id":121,"name":"Финляндия","nameVn":"Филяндию","namePr":"Финляндии","iso":"fi","iata":"FIN","code":"Finland","visa":"","transport":"air","default":"eur","lat":64.7179,"lng":24.6094,"zoom":5,"bold":false},{"id":119,"name":"Франция","nameVn":"Францию","namePr":"Франции","iso":"fr","iata":"FRA","code":"France","visa":"","transport":"air","default":"eur","lat":46.195,"lng":2.3291,"zoom":5,"bold":true},{"id":155,"name":"Французская Полинезия","nameVn":"Французскую Полинезию","namePr":"Французской Полинезии","iso":"pf","iata":"PYF","code":"French Polynesia","visa":null,"transport":"air","default":"usd","lat":-17.7121,"lng":-149.36459,"zoom":10,"bold":false},{"id":134,"name":"Хорватия","nameVn":"Хорватию","namePr":"Хорватии","iso":"hr","iata":"HRV","code":"Croatia","visa":"","transport":"air","default":"eur","lat":44.8091,"lng":16.3477,"zoom":6,"bold":true},{"id":123,"name":"Чад","nameVn":"Чад","namePr":"Чаде","iso":"td","iata":"TCD","code":"Chad","visa":null,"transport":"air","default":"usd","lat":15.4537,"lng":18.7207,"zoom":5,"bold":false},{"id":135,"name":"Черногория","nameVn":"Черногорию","namePr":"Черногории","iso":"me","iata":"MNE","code":"Montenegro","visa":"no","transport":"air","default":"eur","lat":42.6945,"lng":19.2096,"zoom":8,"bold":true},{"id":122,"name":"Чехия","nameVn":"Чехию","namePr":"Чехии","iso":"cz","iata":"CZE","code":"Czech Republic","visa":"","transport":"air","default":"eur","lat":49.7884,"lng":15.4248,"zoom":7,"bold":true},{"id":136,"name":"Чили","nameVn":"Чили","namePr":"Чили","iso":"cl","iata":"CHL","code":"Chile","visa":null,"transport":"air","default":"usd","lat":-25.958,"lng":-59.2383,"zoom":3,"bold":false},{"id":124,"name":"Швейцария","nameVn":"Швейцарию","namePr":"Швейцарии","iso":"ch","iata":"CHE","code":"Switzerland","visa":"","transport":"air","default":"usd","lat":47.10751,"lng":8.36064,"zoom":7,"bold":false},{"id":126,"name":"Швеция","nameVn":"Швецию","namePr":"Швеции","iso":"se","iata":"SWE","code":"Sweden","visa":"","transport":"air","default":"usd","lat":64.54844,"lng":16.875,"zoom":4,"bold":false},{"id":125,"name":"Шри-Ланка","nameVn":"Шри-Ланку","namePr":"Шри-Ланке","iso":"lk","iata":"LKA","code":"Sri Lanka","visa":"","transport":"air","default":"usd","lat":7.8743,"lng":80.7715,"zoom":7,"bold":true},{"id":127,"name":"Эквадор","nameVn":"Эквадор","namePr":"Эквадоре","iso":"ec","iata":"ECU","code":"Ecuador","visa":"no","transport":"air","default":"usd","lat":-3.2941,"lng":-76.6626,"zoom":6,"bold":false},{"id":128,"name":"Эстония","nameVn":"Эстонию","namePr":"Эстонии","iso":"ee","iata":"EST","code":"Estonia","visa":"","transport":"air","default":"usd","lat":59.1421,"lng":25.5103,"zoom":6,"bold":false},{"id":129,"name":"Эфиопия","nameVn":"Эфиопию","namePr":"Эфиопии","iso":"et","iata":"ETH","code":"Ethiopia","visa":null,"transport":"air","default":"usd","lat":9.1455,"lng":40.4736,"zoom":5,"bold":false},{"id":130,"name":"ЮАР","nameVn":"ЮАР","namePr":"ЮАР","iso":"za","iata":"ZAF","code":"RSA","visa":"","transport":"air","default":"usd","lat":-29.5352,"lng":25.4004,"zoom":5,"bold":false},{"id":151,"name":"Южная Корея","nameVn":"Южную Корею","namePr":"Южной Корее","iso":"kr","iata":"PRK","code":"South Korea","visa":"","transport":"air","default":"usd","lat":37.1428,"lng":127.5952,"zoom":6,"bold":false},{"id":132,"name":"Ямайка","nameVn":"Ямайку","namePr":"Ямайке","iso":"jm","iata":"JAM","code":"Jamaica","visa":"","transport":"air","default":"usd","lat":18.1153,"lng":-77.2735,"zoom":8,"bold":false},{"id":133,"name":"Япония","nameVn":"Японию","namePr":"Японии","iso":"jp","iata":"JAP","code":"Japan","visa":"","transport":"air","default":"usd","lat":36.3682,"lng":136.8018,"zoom":6,"bold":false}]
     * api_version : 2.4
     * time : 0.0067
     */

    @Id
    @JsonIgnore
    private String id = "_id";

    private String api_version;
    private double time;
    private List<CountriesBean> countries;

    public String getApi_version() {
        return api_version;
    }

    public void setApi_version(String api_version) {
        this.api_version = api_version;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public List<CountriesBean> getCountries() {
        return countries;
    }

    public void setCountries(List<CountriesBean> countries) {
        this.countries = countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Countries countries1 = (Countries) o;
        return Double.compare(countries1.time, time) == 0 &&
                Objects.equals(id, countries1.id) &&
                Objects.equals(api_version, countries1.api_version) &&
                Objects.equals(countries, countries1.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, api_version, time, countries);
    }

    @Override
    public String toString() {
        return "Countries{" +
                "id='" + id + '\'' +
                ", api_version='" + api_version + '\'' +
                ", time=" + time +
                ", countries=" + countries +
                '}';
    }

    public static class CountriesBean {
        /**
         * id : 7
         * name : Австралия
         * nameVn : Австралию
         * namePr : Австралии
         * iso : au
         * iata : AUL
         * code : Australia
         * visa :
         * transport : air
         * default : usd
         * lat : -28.8447
         * lng : 135.08791
         * zoom : 4
         * bold : false
         */

        private int id;
        private String name;
        private String nameVn;
        private String namePr;
        private String iso;
        private String iata;
        private String code;
        private String visa;
        private String transport;

        @JsonSetter("default")
        private String defaultX;

        private double lat;
        private double lng;
        private int zoom;
        private boolean bold;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNameVn() {
            return nameVn;
        }

        public void setNameVn(String nameVn) {
            this.nameVn = nameVn;
        }

        public String getNamePr() {
            return namePr;
        }

        public void setNamePr(String namePr) {
            this.namePr = namePr;
        }

        public String getIso() {
            return iso;
        }

        public void setIso(String iso) {
            this.iso = iso;
        }

        public String getIata() {
            return iata;
        }

        public void setIata(String iata) {
            this.iata = iata;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getVisa() {
            return visa;
        }

        public void setVisa(String visa) {
            this.visa = visa;
        }

        public String getTransport() {
            return transport;
        }

        public void setTransport(String transport) {
            this.transport = transport;
        }

        public String getDefaultX() {
            return defaultX;
        }

        public void setDefaultX(String defaultX) {
            this.defaultX = defaultX;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }

        public int getZoom() {
            return zoom;
        }

        public void setZoom(int zoom) {
            this.zoom = zoom;
        }

        public boolean isBold() {
            return bold;
        }

        public void setBold(boolean bold) {
            this.bold = bold;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CountriesBean that = (CountriesBean) o;
            return id == that.id &&
                    Double.compare(that.lat, lat) == 0 &&
                    Double.compare(that.lng, lng) == 0 &&
                    zoom == that.zoom &&
                    bold == that.bold &&
                    Objects.equals(name, that.name) &&
                    Objects.equals(nameVn, that.nameVn) &&
                    Objects.equals(namePr, that.namePr) &&
                    Objects.equals(iso, that.iso) &&
                    Objects.equals(iata, that.iata) &&
                    Objects.equals(code, that.code) &&
                    Objects.equals(visa, that.visa) &&
                    Objects.equals(transport, that.transport) &&
                    Objects.equals(defaultX, that.defaultX);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, nameVn, namePr, iso, iata, code, visa, transport, defaultX, lat, lng, zoom, bold);
        }

        @Override
        public String toString() {
            return "CountriesBean{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", nameVn='" + nameVn + '\'' +
                    ", namePr='" + namePr + '\'' +
                    ", iso='" + iso + '\'' +
                    ", iata='" + iata + '\'' +
                    ", code='" + code + '\'' +
                    ", visa='" + visa + '\'' +
                    ", transport='" + transport + '\'' +
                    ", defaultX='" + defaultX + '\'' +
                    ", lat=" + lat +
                    ", lng=" + lng +
                    ", zoom=" + zoom +
                    ", bold=" + bold +
                    '}';
        }
    }
}
