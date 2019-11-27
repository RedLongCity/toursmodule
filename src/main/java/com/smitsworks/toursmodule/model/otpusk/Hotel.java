package com.smitsworks.toursmodule.model.otpusk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * tours/hotel — получение подробной информации об отеле
 * https://otpusk.api.domain/tours/hotel?hotelId=8987&access_token=ACCESS_TOKEN
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotel {

    /**
     * hotel : {"area":"9000","priceOperatorId":"3331","key":"a74bea0e139e68c06de07834385080e5","i":"20178","n":"Sunside Beach Hotel 4*","nm":"Sunside Beach Hotel","h":"Sunside_Beach_Hotel","hru":"Сансайд Бич Хотел,бывш. Blue Moon Beach","s":{"s":"four","n":"4*","c":"&#9733;&#9733;&#9733;&#9733;"},"ad":{"a":"Kucukgol Mevkii Buyukyer Mahallesi, Konakli, Alanya, Antalya, Turkey","ml":"info@sunsidebeachhotel.com","u":"http://www.sunsidebeachhotel.com/","ph":"Tel: +90 (242) 545 43 42, <br />\nFax: +90 (242) 545 43"},"p":{"p":"578.00","c":"eur","d":"2020-04-22","f":"ai","i":"2054775970898418","l":"8","t":"air","up":"2019-04-25 14:24:39"},"fm":{"i":"hotel","n":"Отель","vn":"Отели","vns":"Отелей","rd":"Отеля","pr":"Отеле","wh":"Отель"},"tp":{"i":"beach","n":"пляжный"},"e":{"r":{"shower":{"name":"ванна / душ","all":true,"id":false,"title":null},"hairdryer":{"name":"фен","all":true,"id":false,"title":null},"mini-bar":{"name":"мини-бар","all":true,"id":"pay","title":"платно"},"conditioning":{"name":"кондиционер","all":true,"id":false,"title":null},"tv":{"name":"кабельное/спутниковое ТВ","all":true,"id":false,"title":null},"phone":{"name":"телефон","all":true,"id":false,"title":null},"network":{"name":"интернет wi-fi","all":true,"id":"pay","title":"платно"},"terrace":{"name":"балкон/терраса","all":true,"id":false,"title":null}},"h":{"restaurant":{"id":"yes","value":"есть","title":"","name":"ресторан"},"cafe":{"id":"yes","value":"есть","title":"","name":"кафе / бар"},"outdoor_pool":{"id":"yes","value":"есть","title":"","name":"открытый бассейн"},"conference":{"id":"yes","value":"есть","title":"","name":"конференц-зал / банкетный зал"},"business":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"бизнес-центр"},"parking":{"id":"yes","value":"есть","title":"","name":"автостоянка"},"rent_car":{"id":"yes","value":"есть","title":"","name":"прокат автомобилей"},"safe":{"id":"yes","value":"есть","title":"","name":"сейф"},"elevator":{"id":"yes","value":"есть","title":"","name":"лифт"},"laundry":{"id":"yes","value":"есть","title":"","name":"прачечная"},"salon":{"id":"yes","value":"есть","title":"","name":"парикмахерская / салон красоты"},"doctor":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"врач"},"pets":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"размещение с животными"},"conversion":{"id":"yes","value":"есть","title":"","name":"обмен валют"},"atm":{"id":"yes","value":"есть","title":"","name":"банкомат"},"visa":{"id":"yes","value":"есть","title":"","name":"оплата платежными картами"}},"c":{"childpool":{"id":"yes","value":"есть","title":"","name":"детский бассейн"},"playground":{"id":"yes","value":"есть","title":"","name":"детская площадка"},"nursery":{"id":"yes","value":"есть","title":"","name":"детский клуб"},"childmenu":{"id":"yes","value":"есть","title":"","name":"детское меню в ресторане"},"highchairs":{"id":"yes","value":"есть","title":"","name":"детские стульчики в ресторане"},"crib":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"детская кроватка"},"nurse":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"няня"}},"s":{"sauna":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"сауна / баня / хамам"},"spa":{"id":"yes","value":"есть","title":"","name":"Спа или велнес-центр"},"billiards":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"бильярд"},"table_tennis":{"id":"yes","value":"есть","title":"","name":"настольный теннис"},"tennis_court":{"id":"yes","value":"есть","title":"","name":"теннисный корт"},"volleyball":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"волейбол"},"bikes":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"прокат велосипедов"},"fitness":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"тренажерный зал"},"aerobics":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"аэробика"},"aquapark":{"id":"yes","value":"есть","title":"","name":"аквапарк или горки"},"water_sports":{"id":"yes","value":"есть","title":"","name":"водные развлечения"},"discotheque":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"диско-клуб"},"animation":{"id":"yes","value":"есть","title":"","name":"анимация"}},"b":{"two_line_beach":{"id":"yes","value":"есть","title":"","name":"отель на 2-й пляжной линии"},"own":{"id":"yes","value":"есть","title":"","name":"собственный пляж"},"sandy_pebble":{"id":"yes","value":"есть","title":"","name":"песчано-галечный пляж"},"chairs":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"шезлонги"},"umbrella":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"зонтики"},"towels":{"id":"yes","value":"есть","title":"","name":"пляжные полотенца"}}},"o":{"r":[{"id":"356623","name":"Family Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"6","images":[]},{"id":"356621","name":"Standard Pool View Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"0","images":[]},{"id":"35174","name":"Standard Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"5","images":[{}]}],"b":"Пляж в 150 м, между пляжем и отелем есть дорога, есть подземный переход. Протяжённость \u2013 80 м. Бар на пляже.","bs":{"two_line_beach":"yes","own":"yes","sandy_pebble":"yes","chairs":"free","umbrella":"free","towels":"yes"},"s":"1 водная горка, часы работы 10:00-11:30/15:00-16:30.","ss":{"sauna":"free","spa":"yes","billiards":"pay","table_tennis":"yes","tennis_court":"yes","volleyball":"free","bikes":"pay","fitness":"free","aerobics":"free","aquapark":"yes","water_sports":"yes","discotheque":"pay","animation":"yes"},"hs":{"restaurant":"yes","cafe":"yes","outdoor_pool":"yes","conference":"yes","business":"pay","parking":"yes","rent_car":"yes","safe":"yes","wifi":"","elevator":"yes","laundry":"yes","salon":"yes","doctor":"pay","pets":"pay","transfer":"","conversion":"yes","atm":"yes","visa":"yes"},"c":"Мини-клуб для детей в возрасте от 4 до 12 лет, часы работы: с 10:00-12:00/15:00-17:00. <br />\nАренда детских колясок (платно).","cs":{"childpool":"yes","playground":"yes","nursery":"yes","childmenu":"yes","highchairs":"yes","crib":"free","nurse":"pay"},"ds":"Всего 110 номеров в двух пятиэтажных зданиях.","fh":"Wi-Fi (платно). <br />\nЗавтрак 07:30-09:30, обед 12:30-14:00, чай/выпечка (у бассейна) 17:00-18:00, ужин 19:00-21:00. Шведский стол. <br />\nБар у бассейна, 10:00-23:00. <br />\nБар на пляже, 10:00-18:00 (предлагаются безалкогольные напитки). <br />\n1 открытый бассейн, площадь 126 кв.м, часы работы: 08:00-18:00.","di":"12 км от г. Алания. 110 км от аэропорта Анталии.","dc":"Отель расположен рядом с посёлком Конаклы, через дорогу от пляжа. Построен в 1996 году, последняя реновация проведена в 2017 году. Отель состоит из двух пятиэтажных корпусов. Подойдёт для экономичного семейного и молодёжного отдыха."},"c":{"i":"953","c":"alanja","n":"Алания","rd":"Алании","vn":"Аланию"},"t":{"i":"115","c":"turkey","cd":"tr","n":"Турция","rd":"Турции","vn":"Турцию"},"f":["00/02/92/98/2929881.jpg","00/02/92/99/2929901.jpg","00/02/92/99/2929906.jpg","00/02/92/99/2929976.jpg","00/02/92/98/2929891.jpg","00/02/92/98/2929896.jpg","00/02/92/99/2929916.jpg","00/02/92/99/2929921.jpg","00/02/92/98/2929886.jpg","00/02/92/99/2929911.jpg","00/02/92/99/2929971.jpg","00/02/92/99/2929981.jpg","00/02/92/99/2929926.jpg","00/02/92/99/2929966.jpg"],"fc":14,"r":2.7,"ri":{"people":17,"children":17,"seniors":16,"busines":1,"single":8},"tr":"2.6755","vi":"a74bea0e139e68c06de07834385080e5","v":"84","vs":{"1":{"name":"номера","vote":2.9,"count":52},"2":{"name":"сервис","vote":2.6,"count":51},"3":{"name":"чистота","vote":2.7,"count":52},"4":{"name":"питание","vote":2.8,"count":52},"5":{"name":"инфраструктура","vote":3.1,"count":52}},"watermark":"","ag":{"n":"Море Туров Кривой Рог на Вечернем","a":"","o":[{"id":8806,"city":"Кривой Рог","address":"Ивана Авраменка, 3"}]}}
     * api_version : 2.4
     * time : 0.3859
     */

    private HotelBean hotel;
    private String api_version;
    private double time;

    public static class HotelBean {
        /**
         * area : 9000
         * priceOperatorId : 3331
         * key : a74bea0e139e68c06de07834385080e5
         * i : 20178
         * n : Sunside Beach Hotel 4*
         * nm : Sunside Beach Hotel
         * h : Sunside_Beach_Hotel
         * hru : Сансайд Бич Хотел,бывш. Blue Moon Beach
         * s : {"s":"four","n":"4*","c":"&#9733;&#9733;&#9733;&#9733;"}
         * ad : {"a":"Kucukgol Mevkii Buyukyer Mahallesi, Konakli, Alanya, Antalya, Turkey","ml":"info@sunsidebeachhotel.com","u":"http://www.sunsidebeachhotel.com/","ph":"Tel: +90 (242) 545 43 42, <br />\nFax: +90 (242) 545 43"}
         * p : {"p":"578.00","c":"eur","d":"2020-04-22","f":"ai","i":"2054775970898418","l":"8","t":"air","up":"2019-04-25 14:24:39"}
         * fm : {"i":"hotel","n":"Отель","vn":"Отели","vns":"Отелей","rd":"Отеля","pr":"Отеле","wh":"Отель"}
         * tp : {"i":"beach","n":"пляжный"}
         * e : {"r":{"shower":{"name":"ванна / душ","all":true,"id":false,"title":null},"hairdryer":{"name":"фен","all":true,"id":false,"title":null},"mini-bar":{"name":"мини-бар","all":true,"id":"pay","title":"платно"},"conditioning":{"name":"кондиционер","all":true,"id":false,"title":null},"tv":{"name":"кабельное/спутниковое ТВ","all":true,"id":false,"title":null},"phone":{"name":"телефон","all":true,"id":false,"title":null},"network":{"name":"интернет wi-fi","all":true,"id":"pay","title":"платно"},"terrace":{"name":"балкон/терраса","all":true,"id":false,"title":null}},"h":{"restaurant":{"id":"yes","value":"есть","title":"","name":"ресторан"},"cafe":{"id":"yes","value":"есть","title":"","name":"кафе / бар"},"outdoor_pool":{"id":"yes","value":"есть","title":"","name":"открытый бассейн"},"conference":{"id":"yes","value":"есть","title":"","name":"конференц-зал / банкетный зал"},"business":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"бизнес-центр"},"parking":{"id":"yes","value":"есть","title":"","name":"автостоянка"},"rent_car":{"id":"yes","value":"есть","title":"","name":"прокат автомобилей"},"safe":{"id":"yes","value":"есть","title":"","name":"сейф"},"elevator":{"id":"yes","value":"есть","title":"","name":"лифт"},"laundry":{"id":"yes","value":"есть","title":"","name":"прачечная"},"salon":{"id":"yes","value":"есть","title":"","name":"парикмахерская / салон красоты"},"doctor":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"врач"},"pets":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"размещение с животными"},"conversion":{"id":"yes","value":"есть","title":"","name":"обмен валют"},"atm":{"id":"yes","value":"есть","title":"","name":"банкомат"},"visa":{"id":"yes","value":"есть","title":"","name":"оплата платежными картами"}},"c":{"childpool":{"id":"yes","value":"есть","title":"","name":"детский бассейн"},"playground":{"id":"yes","value":"есть","title":"","name":"детская площадка"},"nursery":{"id":"yes","value":"есть","title":"","name":"детский клуб"},"childmenu":{"id":"yes","value":"есть","title":"","name":"детское меню в ресторане"},"highchairs":{"id":"yes","value":"есть","title":"","name":"детские стульчики в ресторане"},"crib":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"детская кроватка"},"nurse":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"няня"}},"s":{"sauna":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"сауна / баня / хамам"},"spa":{"id":"yes","value":"есть","title":"","name":"Спа или велнес-центр"},"billiards":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"бильярд"},"table_tennis":{"id":"yes","value":"есть","title":"","name":"настольный теннис"},"tennis_court":{"id":"yes","value":"есть","title":"","name":"теннисный корт"},"volleyball":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"волейбол"},"bikes":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"прокат велосипедов"},"fitness":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"тренажерный зал"},"aerobics":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"аэробика"},"aquapark":{"id":"yes","value":"есть","title":"","name":"аквапарк или горки"},"water_sports":{"id":"yes","value":"есть","title":"","name":"водные развлечения"},"discotheque":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"диско-клуб"},"animation":{"id":"yes","value":"есть","title":"","name":"анимация"}},"b":{"two_line_beach":{"id":"yes","value":"есть","title":"","name":"отель на 2-й пляжной линии"},"own":{"id":"yes","value":"есть","title":"","name":"собственный пляж"},"sandy_pebble":{"id":"yes","value":"есть","title":"","name":"песчано-галечный пляж"},"chairs":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"шезлонги"},"umbrella":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"зонтики"},"towels":{"id":"yes","value":"есть","title":"","name":"пляжные полотенца"}}}
         * o : {"r":[{"id":"356623","name":"Family Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"6","images":[]},{"id":"356621","name":"Standard Pool View Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"0","images":[]},{"id":"35174","name":"Standard Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"5","images":[{}]}],"b":"Пляж в 150 м, между пляжем и отелем есть дорога, есть подземный переход. Протяжённость \u2013 80 м. Бар на пляже.","bs":{"two_line_beach":"yes","own":"yes","sandy_pebble":"yes","chairs":"free","umbrella":"free","towels":"yes"},"s":"1 водная горка, часы работы 10:00-11:30/15:00-16:30.","ss":{"sauna":"free","spa":"yes","billiards":"pay","table_tennis":"yes","tennis_court":"yes","volleyball":"free","bikes":"pay","fitness":"free","aerobics":"free","aquapark":"yes","water_sports":"yes","discotheque":"pay","animation":"yes"},"hs":{"restaurant":"yes","cafe":"yes","outdoor_pool":"yes","conference":"yes","business":"pay","parking":"yes","rent_car":"yes","safe":"yes","wifi":"","elevator":"yes","laundry":"yes","salon":"yes","doctor":"pay","pets":"pay","transfer":"","conversion":"yes","atm":"yes","visa":"yes"},"c":"Мини-клуб для детей в возрасте от 4 до 12 лет, часы работы: с 10:00-12:00/15:00-17:00. <br />\nАренда детских колясок (платно).","cs":{"childpool":"yes","playground":"yes","nursery":"yes","childmenu":"yes","highchairs":"yes","crib":"free","nurse":"pay"},"ds":"Всего 110 номеров в двух пятиэтажных зданиях.","fh":"Wi-Fi (платно). <br />\nЗавтрак 07:30-09:30, обед 12:30-14:00, чай/выпечка (у бассейна) 17:00-18:00, ужин 19:00-21:00. Шведский стол. <br />\nБар у бассейна, 10:00-23:00. <br />\nБар на пляже, 10:00-18:00 (предлагаются безалкогольные напитки). <br />\n1 открытый бассейн, площадь 126 кв.м, часы работы: 08:00-18:00.","di":"12 км от г. Алания. 110 км от аэропорта Анталии.","dc":"Отель расположен рядом с посёлком Конаклы, через дорогу от пляжа. Построен в 1996 году, последняя реновация проведена в 2017 году. Отель состоит из двух пятиэтажных корпусов. Подойдёт для экономичного семейного и молодёжного отдыха."}
         * c : {"i":"953","c":"alanja","n":"Алания","rd":"Алании","vn":"Аланию"}
         * t : {"i":"115","c":"turkey","cd":"tr","n":"Турция","rd":"Турции","vn":"Турцию"}
         * f : ["00/02/92/98/2929881.jpg","00/02/92/99/2929901.jpg","00/02/92/99/2929906.jpg","00/02/92/99/2929976.jpg","00/02/92/98/2929891.jpg","00/02/92/98/2929896.jpg","00/02/92/99/2929916.jpg","00/02/92/99/2929921.jpg","00/02/92/98/2929886.jpg","00/02/92/99/2929911.jpg","00/02/92/99/2929971.jpg","00/02/92/99/2929981.jpg","00/02/92/99/2929926.jpg","00/02/92/99/2929966.jpg"]
         * fc : 14
         * r : 2.7
         * ri : {"people":17,"children":17,"seniors":16,"busines":1,"single":8}
         * tr : 2.6755
         * vi : a74bea0e139e68c06de07834385080e5
         * v : 84
         * vs : {"1":{"name":"номера","vote":2.9,"count":52},"2":{"name":"сервис","vote":2.6,"count":51},"3":{"name":"чистота","vote":2.7,"count":52},"4":{"name":"питание","vote":2.8,"count":52},"5":{"name":"инфраструктура","vote":3.1,"count":52}}
         * watermark :
         * ag : {"n":"Море Туров Кривой Рог на Вечернем","a":"","o":[{"id":8806,"city":"Кривой Рог","address":"Ивана Авраменка, 3"}]}
         */

        private String area;
        private String priceOperatorId;
        private String key;
        private String i;
        private String n;
        private String nm;
        private String h;
        private String hru;
        private Map<String, String> s;
        private Map<String, String> ad;
        private Map<String, String> p;
        private Map<String, String> fm;
        private Map<String, String> tp;
        private EBean e;
        private OBean o;
        private CBeanX c;
        private TBean t;
        private int fc;
        private double r;
        private RiBean ri;
        private String tr;
        private String vi;
        private String v;
        private Map<String, VsOptionBean> vs;
        private String watermark;
        private AgBean ag;
        private List<String> f;

        public static class EBean {
            /**
             * r : {"shower":{"name":"ванна / душ","all":true,"id":false,"title":null},"hairdryer":{"name":"фен","all":true,"id":false,"title":null},"mini-bar":{"name":"мини-бар","all":true,"id":"pay","title":"платно"},"conditioning":{"name":"кондиционер","all":true,"id":false,"title":null},"tv":{"name":"кабельное/спутниковое ТВ","all":true,"id":false,"title":null},"phone":{"name":"телефон","all":true,"id":false,"title":null},"network":{"name":"интернет wi-fi","all":true,"id":"pay","title":"платно"},"terrace":{"name":"балкон/терраса","all":true,"id":false,"title":null}}
             * h : {"restaurant":{"id":"yes","value":"есть","title":"","name":"ресторан"},"cafe":{"id":"yes","value":"есть","title":"","name":"кафе / бар"},"outdoor_pool":{"id":"yes","value":"есть","title":"","name":"открытый бассейн"},"conference":{"id":"yes","value":"есть","title":"","name":"конференц-зал / банкетный зал"},"business":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"бизнес-центр"},"parking":{"id":"yes","value":"есть","title":"","name":"автостоянка"},"rent_car":{"id":"yes","value":"есть","title":"","name":"прокат автомобилей"},"safe":{"id":"yes","value":"есть","title":"","name":"сейф"},"elevator":{"id":"yes","value":"есть","title":"","name":"лифт"},"laundry":{"id":"yes","value":"есть","title":"","name":"прачечная"},"salon":{"id":"yes","value":"есть","title":"","name":"парикмахерская / салон красоты"},"doctor":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"врач"},"pets":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"размещение с животными"},"conversion":{"id":"yes","value":"есть","title":"","name":"обмен валют"},"atm":{"id":"yes","value":"есть","title":"","name":"банкомат"},"visa":{"id":"yes","value":"есть","title":"","name":"оплата платежными картами"}}
             * c : {"childpool":{"id":"yes","value":"есть","title":"","name":"детский бассейн"},"playground":{"id":"yes","value":"есть","title":"","name":"детская площадка"},"nursery":{"id":"yes","value":"есть","title":"","name":"детский клуб"},"childmenu":{"id":"yes","value":"есть","title":"","name":"детское меню в ресторане"},"highchairs":{"id":"yes","value":"есть","title":"","name":"детские стульчики в ресторане"},"crib":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"детская кроватка"},"nurse":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"няня"}}
             * s : {"sauna":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"сауна / баня / хамам"},"spa":{"id":"yes","value":"есть","title":"","name":"Спа или велнес-центр"},"billiards":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"бильярд"},"table_tennis":{"id":"yes","value":"есть","title":"","name":"настольный теннис"},"tennis_court":{"id":"yes","value":"есть","title":"","name":"теннисный корт"},"volleyball":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"волейбол"},"bikes":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"прокат велосипедов"},"fitness":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"тренажерный зал"},"aerobics":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"аэробика"},"aquapark":{"id":"yes","value":"есть","title":"","name":"аквапарк или горки"},"water_sports":{"id":"yes","value":"есть","title":"","name":"водные развлечения"},"discotheque":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"диско-клуб"},"animation":{"id":"yes","value":"есть","title":"","name":"анимация"}}
             * b : {"two_line_beach":{"id":"yes","value":"есть","title":"","name":"отель на 2-й пляжной линии"},"own":{"id":"yes","value":"есть","title":"","name":"собственный пляж"},"sandy_pebble":{"id":"yes","value":"есть","title":"","name":"песчано-галечный пляж"},"chairs":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"шезлонги"},"umbrella":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"зонтики"},"towels":{"id":"yes","value":"есть","title":"","name":"пляжные полотенца"}}
             */

            private Map<String, ROptionBean> r;
            private Map<String, HOptionBean> h;
            private Map<String, HOptionBean> c;
            private Map<String, HOptionBean> s;
            private Map<String, HOptionBean> b;

            public static class ROptionBean {
                /**
                 * name : ванна / душ
                 * all : true
                 * id : false
                 * title : null
                 */

                private String name;
                private boolean all;
                private String id;
                private Object title;

                public ROptionBean() {
                }

                public ROptionBean(String name, boolean all, String id, Object title) {
                    this.name = name;
                    this.all = all;
                    this.id = id;
                    this.title = title;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public boolean isAll() {
                    return all;
                }

                public void setAll(boolean all) {
                    this.all = all;
                }

                public String isId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public Object getTitle() {
                    return title;
                }

                public void setTitle(Object title) {
                    this.title = title;
                }

                @Override
                public boolean equals(Object o) {
                    if (this == o) return true;
                    if (o == null || getClass() != o.getClass()) return false;
                    ROptionBean that = (ROptionBean) o;
                    return all == that.all &&
                            Objects.equals(name, that.name) &&
                            Objects.equals(id, that.id) &&
                            Objects.equals(title, that.title);
                }

                @Override
                public int hashCode() {
                    return Objects.hash(name, all, id, title);
                }

                @Override
                public String toString() {
                    return "ROptionBean{" +
                            "name='" + name + '\'' +
                            ", all=" + all +
                            ", id='" + id + '\'' +
                            ", title=" + title +
                            '}';
                }
            }

            public static class HOptionBean {
                /**
                 * id : yes
                 * value : есть
                 * title :
                 * name : ресторан
                 */

                private String id;
                private String value;
                private String title;
                private String name;

                public HOptionBean() {
                }

                public HOptionBean(String id, String value, String title, String name) {
                    this.id = id;
                    this.value = value;
                    this.title = title;
                    this.name = name;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                @Override
                public boolean equals(Object o) {
                    if (this == o) return true;
                    if (o == null || getClass() != o.getClass()) return false;
                    HOptionBean that = (HOptionBean) o;
                    return Objects.equals(id, that.id) &&
                            Objects.equals(value, that.value) &&
                            Objects.equals(title, that.title) &&
                            Objects.equals(name, that.name);
                }

                @Override
                public int hashCode() {
                    return Objects.hash(id, value, title, name);
                }

                @Override
                public String toString() {
                    return "HOptionBean{" +
                            "id='" + id + '\'' +
                            ", value='" + value + '\'' +
                            ", title='" + title + '\'' +
                            ", name='" + name + '\'' +
                            '}';
                }
            }

            public Map<String, ROptionBean> getR() {
                return r;
            }

            public EBean setR(Map<String, ROptionBean> r) {
                this.r = r;
                return this;
            }

            public Map<String, HOptionBean> getH() {
                return h;
            }

            public EBean setH(Map<String, HOptionBean> h) {
                this.h = h;
                return this;
            }

            public Map<String, HOptionBean> getC() {
                return c;
            }

            public EBean setC(Map<String, HOptionBean> c) {
                this.c = c;
                return this;
            }

            public Map<String, HOptionBean> getS() {
                return s;
            }

            public EBean setS(Map<String, HOptionBean> s) {
                this.s = s;
                return this;
            }

            public Map<String, HOptionBean> getB() {
                return b;
            }

            public EBean setB(Map<String, HOptionBean> b) {
                this.b = b;
                return this;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                EBean eBean = (EBean) o;
                return Objects.equals(r, eBean.r) &&
                        Objects.equals(h, eBean.h) &&
                        Objects.equals(c, eBean.c) &&
                        Objects.equals(s, eBean.s) &&
                        Objects.equals(b, eBean.b);
            }

            @Override
            public int hashCode() {
                return Objects.hash(r, h, c, s, b);
            }

            @Override
            public String toString() {
                return "EBean{" +
                        "r=" + r +
                        ", h=" + h +
                        ", c=" + c +
                        ", s=" + s +
                        ", b=" + b +
                        '}';
            }
        }

        public static class OBean {
            /**
             * r : [{"id":"356623","name":"Family Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"6","images":[]},{"id":"356621","name":"Standard Pool View Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"0","images":[]},{"id":"35174","name":"Standard Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"5","images":[{}]}]
             * b : Пляж в 150 м, между пляжем и отелем есть дорога, есть подземный переход. Протяжённость – 80 м. Бар на пляже.
             * bs : {"two_line_beach":"yes","own":"yes","sandy_pebble":"yes","chairs":"free","umbrella":"free","towels":"yes"}
             * s : 1 водная горка, часы работы 10:00-11:30/15:00-16:30.
             * ss : {"sauna":"free","spa":"yes","billiards":"pay","table_tennis":"yes","tennis_court":"yes","volleyball":"free","bikes":"pay","fitness":"free","aerobics":"free","aquapark":"yes","water_sports":"yes","discotheque":"pay","animation":"yes"}
             * hs : {"restaurant":"yes","cafe":"yes","outdoor_pool":"yes","conference":"yes","business":"pay","parking":"yes","rent_car":"yes","safe":"yes","wifi":"","elevator":"yes","laundry":"yes","salon":"yes","doctor":"pay","pets":"pay","transfer":"","conversion":"yes","atm":"yes","visa":"yes"}
             * c : Мини-клуб для детей в возрасте от 4 до 12 лет, часы работы: с 10:00-12:00/15:00-17:00. <br />
             * Аренда детских колясок (платно).
             * cs : {"childpool":"yes","playground":"yes","nursery":"yes","childmenu":"yes","highchairs":"yes","crib":"free","nurse":"pay"}
             * ds : Всего 110 номеров в двух пятиэтажных зданиях.
             * fh : Wi-Fi (платно). <br />
             * Завтрак 07:30-09:30, обед 12:30-14:00, чай/выпечка (у бассейна) 17:00-18:00, ужин 19:00-21:00. Шведский стол. <br />
             * Бар у бассейна, 10:00-23:00. <br />
             * Бар на пляже, 10:00-18:00 (предлагаются безалкогольные напитки). <br />
             * 1 открытый бассейн, площадь 126 кв.м, часы работы: 08:00-18:00.
             * di : 12 км от г. Алания. 110 км от аэропорта Анталии.
             * dc : Отель расположен рядом с посёлком Конаклы, через дорогу от пляжа. Построен в 1996 году, последняя реновация проведена в 2017 году. Отель состоит из двух пятиэтажных корпусов. Подойдёт для экономичного семейного и молодёжного отдыха.
             */

            private List<RBeanX> r;
            private String b;
            private Map<String, String> bs;
            private String s;
            private Map<String, String> ss;
            private Map<String, String> hs;
            private String c;
            private Map<String, String> cs;
            private String ds;
            private String fh;
            private String di;
            private String dc;

            public static class RBeanX {
                /**
                 * id : 356623
                 * name : Family Room
                 * services : {"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}}
                 * description :
                 * places : 6
                 * images : []
                 */

                private String id;
                private String name;
                private Map<String, ServicesBean> services;
                private String description;
                private String places;
                private List<Object> images;

                public static class ServicesBean {
                    /**
                     * text : ванна / душ
                     * cls : yes
                     * title :
                     */

                    private String text;
                    private String cls;
                    private String title;

                    public ServicesBean() {
                    }

                    public ServicesBean(String text, String cls, String title) {
                        this.text = text;
                        this.cls = cls;
                        this.title = title;
                    }

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public String getCls() {
                        return cls;
                    }

                    public void setCls(String cls) {
                        this.cls = cls;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    @Override
                    public boolean equals(Object o) {
                        if (this == o) return true;
                        if (o == null || getClass() != o.getClass()) return false;
                        ServicesBean that = (ServicesBean) o;
                        return Objects.equals(text, that.text) &&
                                Objects.equals(cls, that.cls) &&
                                Objects.equals(title, that.title);
                    }

                    @Override
                    public int hashCode() {
                        return Objects.hash(text, cls, title);
                    }

                    @Override
                    public String toString() {
                        return "ServicesBean{" +
                                "text='" + text + '\'' +
                                ", cls='" + cls + '\'' +
                                ", title='" + title + '\'' +
                                '}';
                    }
                }

                public String getId() {
                    return id;
                }

                public RBeanX setId(String id) {
                    this.id = id;
                    return this;
                }

                public String getName() {
                    return name;
                }

                public RBeanX setName(String name) {
                    this.name = name;
                    return this;
                }

                public Map<String, ServicesBean> getServices() {
                    return services;
                }

                public RBeanX setServices(Map<String, ServicesBean> services) {
                    this.services = services;
                    return this;
                }

                public String getDescription() {
                    return description;
                }

                public RBeanX setDescription(String description) {
                    this.description = description;
                    return this;
                }

                public String getPlaces() {
                    return places;
                }

                public RBeanX setPlaces(String places) {
                    this.places = places;
                    return this;
                }

                public List<Object> getImages() {
                    return images;
                }

                public RBeanX setImages(List<Object> images) {
                    this.images = images;
                    return this;
                }

                @Override
                public boolean equals(Object o) {
                    if (this == o) return true;
                    if (o == null || getClass() != o.getClass()) return false;
                    RBeanX rBeanX = (RBeanX) o;
                    return Objects.equals(id, rBeanX.id) &&
                            Objects.equals(name, rBeanX.name) &&
                            Objects.equals(services, rBeanX.services) &&
                            Objects.equals(description, rBeanX.description) &&
                            Objects.equals(places, rBeanX.places) &&
                            Objects.equals(images, rBeanX.images);
                }

                @Override
                public int hashCode() {
                    return Objects.hash(id, name, services, description, places, images);
                }

                @Override
                public String toString() {
                    return "RBeanX{" +
                            "id='" + id + '\'' +
                            ", name='" + name + '\'' +
                            ", services=" + services +
                            ", description='" + description + '\'' +
                            ", places='" + places + '\'' +
                            ", images=" + images +
                            '}';
                }
            }

            public List<RBeanX> getR() {
                return r;
            }

            public OBean setR(List<RBeanX> r) {
                this.r = r;
                return this;
            }

            public String getB() {
                return b;
            }

            public OBean setB(String b) {
                this.b = b;
                return this;
            }

            public Map<String, String> getBs() {
                return bs;
            }

            public OBean setBs(Map<String, String> bs) {
                this.bs = bs;
                return this;
            }

            public String getS() {
                return s;
            }

            public OBean setS(String s) {
                this.s = s;
                return this;
            }

            public Map<String, String> getSs() {
                return ss;
            }

            public OBean setSs(Map<String, String> ss) {
                this.ss = ss;
                return this;
            }

            public Map<String, String> getHs() {
                return hs;
            }

            public OBean setHs(Map<String, String> hs) {
                this.hs = hs;
                return this;
            }

            public String getC() {
                return c;
            }

            public OBean setC(String c) {
                this.c = c;
                return this;
            }

            public Map<String, String> getCs() {
                return cs;
            }

            public OBean setCs(Map<String, String> cs) {
                this.cs = cs;
                return this;
            }

            public String getDs() {
                return ds;
            }

            public OBean setDs(String ds) {
                this.ds = ds;
                return this;
            }

            public String getFh() {
                return fh;
            }

            public OBean setFh(String fh) {
                this.fh = fh;
                return this;
            }

            public String getDi() {
                return di;
            }

            public OBean setDi(String di) {
                this.di = di;
                return this;
            }

            public String getDc() {
                return dc;
            }

            public OBean setDc(String dc) {
                this.dc = dc;
                return this;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                OBean oBean = (OBean) o;
                return Objects.equals(r, oBean.r) &&
                        Objects.equals(b, oBean.b) &&
                        Objects.equals(bs, oBean.bs) &&
                        Objects.equals(s, oBean.s) &&
                        Objects.equals(ss, oBean.ss) &&
                        Objects.equals(hs, oBean.hs) &&
                        Objects.equals(c, oBean.c) &&
                        Objects.equals(cs, oBean.cs) &&
                        Objects.equals(ds, oBean.ds) &&
                        Objects.equals(fh, oBean.fh) &&
                        Objects.equals(di, oBean.di) &&
                        Objects.equals(dc, oBean.dc);
            }

            @Override
            public int hashCode() {
                return Objects.hash(r, b, bs, s, ss, hs, c, cs, ds, fh, di, dc);
            }

            @Override
            public String toString() {
                return "OBean{" +
                        "r=" + r +
                        ", b='" + b + '\'' +
                        ", bs=" + bs +
                        ", s='" + s + '\'' +
                        ", ss=" + ss +
                        ", hs=" + hs +
                        ", c='" + c + '\'' +
                        ", cs=" + cs +
                        ", ds='" + ds + '\'' +
                        ", fh='" + fh + '\'' +
                        ", di='" + di + '\'' +
                        ", dc='" + dc + '\'' +
                        '}';
            }
        }

        public static class VsOptionBean {
            /**
             * name : номера
             * vote : 2.9
             * count : 52
             */

            private String name;
            private double vote;
            private int count;

            public VsOptionBean() {
            }

            public VsOptionBean(String name, double vote, int count) {
                this.name = name;
                this.vote = vote;
                this.count = count;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public double getVote() {
                return vote;
            }

            public void setVote(double vote) {
                this.vote = vote;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                VsOptionBean that = (VsOptionBean) o;
                return Double.compare(that.vote, vote) == 0 &&
                        count == that.count &&
                        Objects.equals(name, that.name);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, vote, count);
            }

            @Override
            public String toString() {
                return "VsOptionBean{" +
                        "name='" + name + '\'' +
                        ", vote=" + vote +
                        ", count=" + count +
                        '}';
            }
        }

        public static class CBeanX {
            /**
             * i : 953
             * c : alanja
             * n : Алания
             * rd : Алании
             * vn : Аланию
             */

            private String i;
            private String c;
            private String n;
            private String rd;
            private String vn;

            public CBeanX() {
            }

            public CBeanX(String i, String c, String n, String rd, String vn) {
                this.i = i;
                this.c = c;
                this.n = n;
                this.rd = rd;
                this.vn = vn;
            }

            public String getI() {
                return i;
            }

            public void setI(String i) {
                this.i = i;
            }

            public String getC() {
                return c;
            }

            public void setC(String c) {
                this.c = c;
            }

            public String getN() {
                return n;
            }

            public void setN(String n) {
                this.n = n;
            }

            public String getRd() {
                return rd;
            }

            public void setRd(String rd) {
                this.rd = rd;
            }

            public String getVn() {
                return vn;
            }

            public void setVn(String vn) {
                this.vn = vn;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                CBeanX cBeanX = (CBeanX) o;
                return Objects.equals(i, cBeanX.i) &&
                        Objects.equals(c, cBeanX.c) &&
                        Objects.equals(n, cBeanX.n) &&
                        Objects.equals(rd, cBeanX.rd) &&
                        Objects.equals(vn, cBeanX.vn);
            }

            @Override
            public int hashCode() {
                return Objects.hash(i, c, n, rd, vn);
            }

            @Override
            public String toString() {
                return "CBeanX{" +
                        "i='" + i + '\'' +
                        ", c='" + c + '\'' +
                        ", n='" + n + '\'' +
                        ", rd='" + rd + '\'' +
                        ", vn='" + vn + '\'' +
                        '}';
            }
        }

        public static class TBean {
            /**
             * i : 115
             * c : turkey
             * cd : tr
             * n : Турция
             * rd : Турции
             * vn : Турцию
             */

            private String i;
            private String c;
            private String cd;
            private String n;
            private String rd;
            private String vn;

            public TBean(String i, String c, String cd, String n, String rd, String vn) {
                this.i = i;
                this.c = c;
                this.cd = cd;
                this.n = n;
                this.rd = rd;
                this.vn = vn;
            }

            public TBean() {
            }

            public String getI() {
                return i;
            }

            public void setI(String i) {
                this.i = i;
            }

            public String getC() {
                return c;
            }

            public void setC(String c) {
                this.c = c;
            }

            public String getCd() {
                return cd;
            }

            public void setCd(String cd) {
                this.cd = cd;
            }

            public String getN() {
                return n;
            }

            public void setN(String n) {
                this.n = n;
            }

            public String getRd() {
                return rd;
            }

            public void setRd(String rd) {
                this.rd = rd;
            }

            public String getVn() {
                return vn;
            }

            public void setVn(String vn) {
                this.vn = vn;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                TBean tBean = (TBean) o;
                return Objects.equals(i, tBean.i) &&
                        Objects.equals(c, tBean.c) &&
                        Objects.equals(cd, tBean.cd) &&
                        Objects.equals(n, tBean.n) &&
                        Objects.equals(rd, tBean.rd) &&
                        Objects.equals(vn, tBean.vn);
            }

            @Override
            public int hashCode() {
                return Objects.hash(i, c, cd, n, rd, vn);
            }

            @Override
            public String toString() {
                return "TBean{" +
                        "i='" + i + '\'' +
                        ", c='" + c + '\'' +
                        ", cd='" + cd + '\'' +
                        ", n='" + n + '\'' +
                        ", rd='" + rd + '\'' +
                        ", vn='" + vn + '\'' +
                        '}';
            }
        }

        public static class RiBean {
            /**
             * people : 17
             * children : 17
             * seniors : 16
             * busines : 1
             * single : 8
             */

            private int people;
            private int children;
            private int seniors;
            private int busines;
            private int single;

            public RiBean() {
            }

            public RiBean(int people, int children, int seniors, int busines, int single) {
                this.people = people;
                this.children = children;
                this.seniors = seniors;
                this.busines = busines;
                this.single = single;
            }

            public int getPeople() {
                return people;
            }

            public void setPeople(int people) {
                this.people = people;
            }

            public int getChildren() {
                return children;
            }

            public void setChildren(int children) {
                this.children = children;
            }

            public int getSeniors() {
                return seniors;
            }

            public void setSeniors(int seniors) {
                this.seniors = seniors;
            }

            public int getBusines() {
                return busines;
            }

            public void setBusines(int busines) {
                this.busines = busines;
            }

            public int getSingle() {
                return single;
            }

            public void setSingle(int single) {
                this.single = single;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                RiBean riBean = (RiBean) o;
                return people == riBean.people &&
                        children == riBean.children &&
                        seniors == riBean.seniors &&
                        busines == riBean.busines &&
                        single == riBean.single;
            }

            @Override
            public int hashCode() {
                return Objects.hash(people, children, seniors, busines, single);
            }

            @Override
            public String toString() {
                return "RiBean{" +
                        "people=" + people +
                        ", children=" + children +
                        ", seniors=" + seniors +
                        ", busines=" + busines +
                        ", single=" + single +
                        '}';
            }
        }

        public static class AgBean {
            /**
             * n : Море Туров Кривой Рог на Вечернем
             * a :
             * o : [{"id":8806,"city":"Кривой Рог","address":"Ивана Авраменка, 3"}]
             */

            private String n;
            private String a;
            private List<OBeanX> o;

            public String getN() {
                return n;
            }

            public AgBean setN(String n) {
                this.n = n;
                return this;
            }

            public String getA() {
                return a;
            }

            public AgBean setA(String a) {
                this.a = a;
                return this;
            }

            public List<OBeanX> getO() {
                return o;
            }

            public AgBean setO(List<OBeanX> o) {
                this.o = o;
                return this;
            }

            public static class OBeanX {
                /**
                 * id : 8806
                 * city : Кривой Рог
                 * address : Ивана Авраменка, 3
                 */

                private int id;
                private String city;
                private String address;

                public OBeanX() {
                }

                public OBeanX(int id, String city, String address) {
                    this.id = id;
                    this.city = city;
                    this.address = address;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                @Override
                public boolean equals(Object o) {
                    if (this == o) return true;
                    if (o == null || getClass() != o.getClass()) return false;
                    OBeanX oBeanX = (OBeanX) o;
                    return id == oBeanX.id &&
                            Objects.equals(city, oBeanX.city) &&
                            Objects.equals(address, oBeanX.address);
                }

                @Override
                public int hashCode() {
                    return Objects.hash(id, city, address);
                }

                @Override
                public String toString() {
                    return "OBeanX{" +
                            "id=" + id +
                            ", city='" + city + '\'' +
                            ", address='" + address + '\'' +
                            '}';
                }
            }

            @Override
            public boolean equals(Object o1) {
                if (this == o1) return true;
                if (o1 == null || getClass() != o1.getClass()) return false;
                AgBean agBean = (AgBean) o1;
                return Objects.equals(n, agBean.n) &&
                        Objects.equals(a, agBean.a) &&
                        Objects.equals(o, agBean.o);
            }

            @Override
            public int hashCode() {
                return Objects.hash(n, a, o);
            }

            @Override
            public String toString() {
                return "AgBean{" +
                        "n='" + n + '\'' +
                        ", a='" + a + '\'' +
                        ", o=" + o +
                        '}';
            }
        }

        public String getArea() {
            return area;
        }

        public HotelBean setArea(String area) {
            this.area = area;
            return this;
        }

        public String getPriceOperatorId() {
            return priceOperatorId;
        }

        public HotelBean setPriceOperatorId(String priceOperatorId) {
            this.priceOperatorId = priceOperatorId;
            return this;
        }

        public String getKey() {
            return key;
        }

        public HotelBean setKey(String key) {
            this.key = key;
            return this;
        }

        public String getI() {
            return i;
        }

        public HotelBean setI(String i) {
            this.i = i;
            return this;
        }

        public String getN() {
            return n;
        }

        public HotelBean setN(String n) {
            this.n = n;
            return this;
        }

        public String getNm() {
            return nm;
        }

        public HotelBean setNm(String nm) {
            this.nm = nm;
            return this;
        }

        public String getH() {
            return h;
        }

        public HotelBean setH(String h) {
            this.h = h;
            return this;
        }

        public String getHru() {
            return hru;
        }

        public HotelBean setHru(String hru) {
            this.hru = hru;
            return this;
        }

        public Map<String, String> getS() {
            return s;
        }

        public HotelBean setS(Map<String, String> s) {
            this.s = s;
            return this;
        }

        public Map<String, String> getAd() {
            return ad;
        }

        public HotelBean setAd(Map<String, String> ad) {
            this.ad = ad;
            return this;
        }

        public Map<String, String> getP() {
            return p;
        }

        public HotelBean setP(Map<String, String> p) {
            this.p = p;
            return this;
        }

        public Map<String, String> getFm() {
            return fm;
        }

        public HotelBean setFm(Map<String, String> fm) {
            this.fm = fm;
            return this;
        }

        public Map<String, String> getTp() {
            return tp;
        }

        public HotelBean setTp(Map<String, String> tp) {
            this.tp = tp;
            return this;
        }

        public EBean getE() {
            return e;
        }

        public HotelBean setE(EBean e) {
            this.e = e;
            return this;
        }

        public OBean getO() {
            return o;
        }

        public HotelBean setO(OBean o) {
            this.o = o;
            return this;
        }

        public CBeanX getC() {
            return c;
        }

        public HotelBean setC(CBeanX c) {
            this.c = c;
            return this;
        }

        public TBean getT() {
            return t;
        }

        public HotelBean setT(TBean t) {
            this.t = t;
            return this;
        }

        public int getFc() {
            return fc;
        }

        public HotelBean setFc(int fc) {
            this.fc = fc;
            return this;
        }

        public double getR() {
            return r;
        }

        public HotelBean setR(double r) {
            this.r = r;
            return this;
        }

        public RiBean getRi() {
            return ri;
        }

        public HotelBean setRi(RiBean ri) {
            this.ri = ri;
            return this;
        }

        public String getTr() {
            return tr;
        }

        public HotelBean setTr(String tr) {
            this.tr = tr;
            return this;
        }

        public String getVi() {
            return vi;
        }

        public HotelBean setVi(String vi) {
            this.vi = vi;
            return this;
        }

        public String getV() {
            return v;
        }

        public HotelBean setV(String v) {
            this.v = v;
            return this;
        }

        public Map<String, VsOptionBean> getVs() {
            return vs;
        }

        public HotelBean setVs(Map<String, VsOptionBean> vs) {
            this.vs = vs;
            return this;
        }

        public String getWatermark() {
            return watermark;
        }

        public HotelBean setWatermark(String watermark) {
            this.watermark = watermark;
            return this;
        }

        public AgBean getAg() {
            return ag;
        }

        public HotelBean setAg(AgBean ag) {
            this.ag = ag;
            return this;
        }

        public List<String> getF() {
            return f;
        }

        public HotelBean setF(List<String> f) {
            this.f = f;
            return this;
        }

        @Override
        public boolean equals(Object o1) {
            if (this == o1) return true;
            if (o1 == null || getClass() != o1.getClass()) return false;
            HotelBean hotelBean = (HotelBean) o1;
            return fc == hotelBean.fc &&
                    Double.compare(hotelBean.r, r) == 0 &&
                    Objects.equals(area, hotelBean.area) &&
                    Objects.equals(priceOperatorId, hotelBean.priceOperatorId) &&
                    Objects.equals(key, hotelBean.key) &&
                    Objects.equals(i, hotelBean.i) &&
                    Objects.equals(n, hotelBean.n) &&
                    Objects.equals(nm, hotelBean.nm) &&
                    Objects.equals(h, hotelBean.h) &&
                    Objects.equals(hru, hotelBean.hru) &&
                    Objects.equals(s, hotelBean.s) &&
                    Objects.equals(ad, hotelBean.ad) &&
                    Objects.equals(p, hotelBean.p) &&
                    Objects.equals(fm, hotelBean.fm) &&
                    Objects.equals(tp, hotelBean.tp) &&
                    Objects.equals(e, hotelBean.e) &&
                    Objects.equals(o, hotelBean.o) &&
                    Objects.equals(c, hotelBean.c) &&
                    Objects.equals(t, hotelBean.t) &&
                    Objects.equals(ri, hotelBean.ri) &&
                    Objects.equals(tr, hotelBean.tr) &&
                    Objects.equals(vi, hotelBean.vi) &&
                    Objects.equals(v, hotelBean.v) &&
                    Objects.equals(vs, hotelBean.vs) &&
                    Objects.equals(watermark, hotelBean.watermark) &&
                    Objects.equals(ag, hotelBean.ag) &&
                    Objects.equals(f, hotelBean.f);
        }

        @Override
        public int hashCode() {
            return Objects.hash(area, priceOperatorId, key, i, n, nm, h, hru, s, ad, p, fm, tp, e, o, c, t, fc, r, ri, tr, vi, v, vs, watermark, ag, f);
        }

        @Override
        public String toString() {
            return "HotelBean{" +
                    "area='" + area + '\'' +
                    ", priceOperatorId='" + priceOperatorId + '\'' +
                    ", key='" + key + '\'' +
                    ", i='" + i + '\'' +
                    ", n='" + n + '\'' +
                    ", nm='" + nm + '\'' +
                    ", h='" + h + '\'' +
                    ", hru='" + hru + '\'' +
                    ", s=" + s +
                    ", ad=" + ad +
                    ", p=" + p +
                    ", fm=" + fm +
                    ", tp=" + tp +
                    ", e=" + e +
                    ", o=" + o +
                    ", c=" + c +
                    ", t=" + t +
                    ", fc=" + fc +
                    ", r=" + r +
                    ", ri=" + ri +
                    ", tr='" + tr + '\'' +
                    ", vi='" + vi + '\'' +
                    ", v='" + v + '\'' +
                    ", vs=" + vs +
                    ", watermark='" + watermark + '\'' +
                    ", ag=" + ag +
                    ", f=" + f +
                    '}';
        }
    }

    public HotelBean getHotel() {
        return hotel;
    }

    public Hotel setHotel(HotelBean hotel) {
        this.hotel = hotel;
        return this;
    }

    public String getApi_version() {
        return api_version;
    }

    public Hotel setApi_version(String api_version) {
        this.api_version = api_version;
        return this;
    }

    public double getTime() {
        return time;
    }

    public Hotel setTime(double time) {
        this.time = time;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel1 = (Hotel) o;
        return Double.compare(hotel1.time, time) == 0 &&
                Objects.equals(hotel, hotel1.hotel) &&
                Objects.equals(api_version, hotel1.api_version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotel, api_version, time);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotel=" + hotel +
                ", api_version='" + api_version + '\'' +
                ", time=" + time +
                '}';
    }
}
