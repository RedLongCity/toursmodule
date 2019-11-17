package com.smitsworks.toursmodule.parsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smitsworks.toursmodule.model.otpusk.ServicesDescriptions;
import com.smitsworks.toursmodule.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ServicesDescriptionsParsingTest {

    @Autowired
    @Qualifier("simple")
    private ObjectMapper objectMapper;

    private ServicesDescriptions servicesDescriptions;

    /**
     * {
     * "mainService": {
     * "restaurant": "ресторан",
     * "a_la_carte": "ресторан A la Carte",
     * "cafe": "кафебар",
     * "dining": "столовая\/зал для завтраков",
     * "outdoor_pool": "открытыйбассейн",
     * "indoor_pool": "крытый бассейн",
     * "conference": "конференц-зал банкетныйзал",
     * "business": "бизнес-центр",
     * "parking": "автостоянка",
     * "rent_car": "прокатавтомобилей",
     * "safe": "сейф",
     * "wifi": "бесплатныйWi-fi",
     * "internet": "интернет-кафе",
     * "elevator": "лифт",
     * "laundry": "прачечная",
     * "cleaners": "химчистка",
     * "salon": "парикмахерская \/ салон красоты",
     * "conversion": "обменвалют",
     * "atm": "банкомат",
     * "doctor": "врач",
     * "invalids": "условия дляинвалидов",
     * "pets": "размещение с животными",
     * "non_smoking": "номера длянекурящих",
     * "ski_rental": "прокат лыж",
     * "ski_storage": "комната для хранениялыж",
     * "transfer": "трансфер в\/из аэропорта",
     * "late_check": "поздний выезд",
     * "dock": "причал для яхт",
     * "park": "сад\/парк",
     * "visa": "оплата платежными картами"
     * },
     * "childService": {
     * "childpool": "детский бассейн",
     * "playground": "детская площадка",
     * "nursery": "детский клуб",
     * "childmenu": "детское меню в ресторане",
     * "highchairs": "детские стульчики в ресторане",
     * "crib": "детская кроватка",
     * "nurse": "няня"
     * },
     * "sportService": {
     * "sauna": "сауна \/ баня хамам",
     * "jacuzzi": "джакузи",
     * "massage": "массаж",
     * "spa": "Спа или велнес-центр",
     * "billiards": "бильярд",
     * "bowling": "боулинг",
     * "table_tennis": "настольный теннис",
     * "tennis_court": "теннисный корт",
     * "squash": "сквош",
     * "golf": "гольф",
     * "volleyball": "волейбол",
     * "basketball": "баскет больная площадка",
     * "football": "футбольное поле",
     * "equestrian": "центр верховой езды",
     * "bikes": "прокат велосипедов",
     * "ski_slopes": "рядом подъёмник (до 600 м)",
     * "fitness": "тренажерный зал",
     * "aerobics": "аэробика",
     * "yoga": "занятия йогой",
     * "aquapark": "аквапарк или горки",
     * "water_sports": "водные развлечения",
     * "diving": "дайвинг",
     * "surfing": "серфинг",
     * "windsurfing": "виндсерфинг",
     * "fishing": "рыбная ловля",
     * "discotheque": "дискотека",
     * "music": "живаямузыка",
     * "casino": "казино",
     * "animation": "анимация",
     * "excursions": "организация экскурсий",
     * "weddings": "служба организации торжеств"
     * },
     * "beachService": {
     * "own": "собственный пляж",
     * "town": "городской пляж",
     * "sandy": "песчаный пляж",
     * "sandy_pebble": "песчано-галечный пляж",
     * "pebble": "галечный пляж",
     * "pontoon": "понтон\/пирс",
     * "chairs": "шезлонги",
     * "umbrella": "зонтики",
     * "towels": "пляжные полотенца",
     * "one_line_beach": "отель на 1-й пляжной линии",
     * "two_line_beach": "отель на 2-й пляжной линии",
     * "next_beach_line": "отельна 3-й пляжной линии или далее"
     * },
     * "roomService": {
     * "shower": "ванна душ",
     * "bidet": "биде",
     * "hairdryer": "фен",
     * "individual": "тапочки и халат",
     * "mini-bar": "мини-бар",
     * "peter": "сейф",
     * "conditioning": "кондиционер",
     * "fan": "вентилятор",
     * "tv": "кабельное\/спутниковое ТВ",
     * "plasma": "плазменный телевизор",
     * "dvd": "vcd\/dvd",
     * "phone": "телефон",
     * "network": "интернет wi-fi",
     * "lan": "кабельный интернет",
     * "kitchen": "кухня\/кухонный уголок",
     * "coffee": "чайник\/кофеварка",
     * "microwave": "микроволновая печь",
     * "fridge": "холодильник",
     * "alarm": "услуга «будильник»",
     * "terrace": "балкон\/терраса",
     * "whirlpool": "джакузи",
     * "pool": "бассейн"
     * }
     * }
     */
    @Before
    public void populate() {
        servicesDescriptions = new ServicesDescriptions();

        Map<String, String> mainService = new HashMap<>();
        servicesDescriptions.setMainService(mainService);
        mainService.put("restaurant", "ресторан");
        mainService.put("a_la_carte", "ресторан A la Carte");
        mainService.put("cafe", "кафебар");
        mainService.put("dining", "столовая зал для завтраков");
        mainService.put("outdoor_pool", "открытыйбассейн");
        mainService.put("indoor_pool", "крытый бассейн");
        mainService.put("conference", "конференц-зал банкетныйзал");
        mainService.put("business", "бизнес-центр");
        mainService.put("parking", "автостоянка");
        mainService.put("rent_car", "прокатавтомобилей");
        mainService.put("safe", "сейф");
        mainService.put("wifi", "бесплатныйWi-fi");
        mainService.put("internet", "интернет-кафе");
        mainService.put("elevator", "лифт");
        mainService.put("laundry", "прачечная");
        mainService.put("cleaners", "химчистка");
        mainService.put("salon", "парикмахерская   салон красоты");
        mainService.put("conversion", "обменвалют");
        mainService.put("atm", "банкомат");
        mainService.put("doctor", "врач");
        mainService.put("invalids", "условия дляинвалидов");
        mainService.put("pets", "размещение с животными");
        mainService.put("non_smoking", "номера длянекурящих");
        mainService.put("ski_rental", "прокат лыж");
        mainService.put("ski_storage", "комната для хранениялыж");
        mainService.put("transfer", "трансфер в из аэропорта");
        mainService.put("late_check", "поздний выезд");
        mainService.put("dock", "причал для яхт");
        mainService.put("park", "сад парк");
        mainService.put("visa", "оплата платежными картами");

        Map<String, String> childService = new HashMap<>();
        servicesDescriptions.setChildService(childService);
        childService.put("childpool", "детский бассейн");
        childService.put("playground", "детская площадка");
        childService.put("nursery", "детский клуб");
        childService.put("childmenu", "детское меню в ресторане");
        childService.put("highchairs", "детские стульчики в ресторане");
        childService.put("crib", "детская кроватка");
        childService.put("nurse", "няня");

        Map<String, String> sportService = new HashMap<>();
        servicesDescriptions.setSportService(sportService);
        sportService.put("sauna", "сауна   баня хамам");
        sportService.put("jacuzzi", "джакузи");
        sportService.put("massage", "массаж");
        sportService.put("spa", "Спа или велнес-центр");
        sportService.put("billiards", "бильярд");
        sportService.put("bowling", "боулинг");
        sportService.put("table_tennis", "настольный теннис");
        sportService.put("tennis_court", "теннисный корт");
        sportService.put("squash", "сквош");
        sportService.put("golf", "гольф");
        sportService.put("volleyball", "волейбол");
        sportService.put("basketball", "баскет больная площадка");
        sportService.put("football", "футбольное поле");
        sportService.put("equestrian", "центр верховой езды");
        sportService.put("bikes", "прокат велосипедов");
        sportService.put("ski_slopes", "рядом подъёмник (до 600 м)");
        sportService.put("fitness", "тренажерный зал");
        sportService.put("aerobics", "аэробика");
        sportService.put("yoga", "занятия йогой");
        sportService.put("aquapark", "аквапарк или горки");
        sportService.put("water_sports", "водные развлечения");
        sportService.put("diving", "дайвинг");
        sportService.put("surfing", "серфинг");
        sportService.put("windsurfing", "виндсерфинг");
        sportService.put("fishing", "рыбная ловля");
        sportService.put("discotheque", "дискотека");
        sportService.put("music", "живаямузыка");
        sportService.put("casino", "казино");
        sportService.put("animation", "анимация");
        sportService.put("excursions", "организация экскурсий");
        sportService.put("weddings", "служба организации торжеств");

        Map<String, String> beachService = new HashMap<>();
        servicesDescriptions.setBeachService(beachService);
        beachService.put("own", "собственный пляж");
        beachService.put("town", "городской пляж");
        beachService.put("sandy", "песчаный пляж");
        beachService.put("sandy_pebble", "песчано-галечный пляж");
        beachService.put("pebble", "галечный пляж");
        beachService.put("pontoon", "понтон пирс");
        beachService.put("chairs", "шезлонги");
        beachService.put("umbrella", "зонтики");
        beachService.put("towels", "пляжные полотенца");
        beachService.put("one_line_beach", "отель на 1-й пляжной линии");
        beachService.put("two_line_beach", "отель на 2-й пляжной линии");
        beachService.put("next_beach_line", "отельна 3-й пляжной линии или далее");

        Map<String, String> roomService = new HashMap<>();
        servicesDescriptions.setRoomService(roomService);

        roomService.put("shower", "ванна душ");
        roomService.put("bidet", "биде");
        roomService.put("hairdryer", "фен");
        roomService.put("individual", "тапочки и халат");
        roomService.put("mini-bar", "мини-бар");
        roomService.put("peter", "сейф");
        roomService.put("conditioning", "кондиционер");
        roomService.put("fan", "вентилятор");
        roomService.put("tv", "кабельное спутниковое ТВ");
        roomService.put("plasma", "плазменный телевизор");
        roomService.put("dvd", "vcd dvd");
        roomService.put("phone", "телефон");
        roomService.put("network", "интернет wi-fi");
        roomService.put("lan", "кабельный интернет");
        roomService.put("kitchen", "кухня кухонный уголок");
        roomService.put("coffee", "чайник кофеварка");
        roomService.put("microwave", "микроволновая печь");
        roomService.put("fridge", "холодильник");
        roomService.put("alarm", "услуга «будильник»");
        roomService.put("terrace", "балкон терраса");
        roomService.put("whirlpool", "джакузи");
        roomService.put("pool", "бассейн");
    }

    @Test
    public void test() throws JsonProcessingException {
        JsonNode node = JsonUtils.getJsonFromResources("json/otpusk_pocket_tours_services_descriptions.json");
        ServicesDescriptions test = objectMapper.treeToValue(node, ServicesDescriptions.class);
        Assert.assertEquals(test.getMainService(), servicesDescriptions.getMainService());
        Assert.assertEquals(test.getChildService(), servicesDescriptions.getChildService());
        Assert.assertEquals(test.getSportService(), servicesDescriptions.getSportService());
        Assert.assertEquals(test.getBeachService(), servicesDescriptions.getBeachService());
        Assert.assertEquals(test.getRoomService(), servicesDescriptions.getRoomService());
        Assert.assertEquals(test, servicesDescriptions);
    }

}
