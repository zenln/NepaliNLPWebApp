package com.icodejava.research.nlp.domain;
/**
 * 
 * @author Kushal Paudyal
 * www.sanjaal.com | www.inepal.org | www.icodejava.com
 * 
 * This class provides an enumeration of majority of the compound word endings in Nepali Language.
 * These are the substrings that can be stripped of a string to try to make a Root Word
 * 
 * Created On: 4/1/2017
 * Last Modified On: 5/1/2017
 *
 */

public enum CompoundWordEnding {
    ANUSAR("अनुसार"),
    BAAREMA_1("बारेमा"),
    BAASI_1("बासी"),
    BAASI_2("बासि"),
    BAHEK("बाहेक"),
    BARE("बारे"),
    BATA("बाट"),
    BATAI("बाटै"), 
    BHANDAA("भन्दा"),
    BHAR("भर"),
    BHARI_1("भरि"),
    BHARI_2("भरी"),
    BHAYEKI("भएकी"),
    BHAYEKO("भएको"),
    BHAYO("भयो"),
    BHITRA("भित्र"),
    BHITRA_KO_1("भित्रको"),
    BHITRA_KO_2("भीत्रको"),
    BHITRA_SAMET("भित्रसमेत"),
    BHITRAI("भित्रै"),
    BHITRAKA("भित्रका"),
    BHITRAMA("भित्रमा"),
    BICH_1("बीच"),
    BICH_2("बिच"),
    BICH_KO_1("बीचको"),
    BICH_KO_2("बिचको"),
    BICH_MA_1("बीचमा"),
    BICH_MA_2("बिचमा"),
    BIHEEN("बिहीन"),
    BIHEENAI("बिहीनै"),
    BIHIN("बिहिन"),
    BIHINAI("बिहिनै"),
    BINA("बिना"),
    BINAA_KA("बिनाका"),
    BIRUDDA_1("बिरुद्द"),
    BIRUDDA_2("बिरूद्द"),
    BIRUDDA_KO_1("बिरुद्दको"),
    BIRUDDA_KO_2("बिरूद्दको"),
    BODH_1("बोध"),
    BODH_2("वोध"),
    DEKHI("देखि"),
    DEKHI_KO_1("देखिको"),
    DEKHI_KO_2("देखीको"),
    DWARA_1("द्वारा"),
    DWARA_2("द्धारा"),
    HARU_1("हरु"),
    HARU_2("हरू"),
    HARU_BICH_1("हरुबीच"),
    HARU_BICH_2("हरूबीच"),
    HARU_JHAIN_1("हरुझैं"),
    HARU_JHAIN_2("हरूझैं"),
    HARU_KAI_1("हरुकै"),
    HARU_KAI_2("हरूकै"),
    HARU_MADHYA_1("हरुमध्ये"),
    HARU_MADHYA_2("हरूमध्ये"),
    HARU_MADHYA_3("हरुमध्य"),
    HARU_MADHYA_4("हरूमध्य"),
    HARU_MATHI_1("हरुमाथि"),
    HARU_MATHI_2("हरूमाथि"),
    HARU_MATHI_3("हरुमाथी"),
    HARU_MATHI_4("हरूमाथी"),
    HARU_PRATI_1("हरुप्रती"),
    HARU_PRATI_2("हरूप्रती"),
    HARU_PRATI_3("हरुप्रति"),
    HARU_PRATI_4("हरूप्रति"),
    HARU_SAMET_1("हरुसमेत"),
    HARU_SAMET_2("हरूसमेत"),
    HARU_SANGA_1("हरुसंग"),
    HARU_SANGA_2("हरूसंग"),
    HARU_SANGA_3("हरुसँग"),
    HARU_SANGA_4("हरूसँग"),
    HARU_SANGA_5("हरुसङ्ग"),
    HARU_SANGA_6("हरूसङ्ग"),
    HARU_SANGA_KO_1("हरुसँगको"),
    HARU_SANGA_KO_2("हरूसंगको"),
    HARU_SANGA_KO_3("हरुसंगको"),
    HARU_SANGA_KO_4("हरूसँगको"),
    HARU_SANGA_KO_5("हरुसङ्गको"),
    HARU_SANGA_KO_6("हरूसङ्गको"),
    HARU_SANGAI_1("हरुसंगै"),
    HARU_SANGAI_2("हरूसंगै"),
    HARU_SANGAI_3("हरुसँगै"),
    HARU_SANGAI_4("हरूसँगै"),
    HARUBAATA_1("हरुबाट"), 
    HARUBAATA_2("हरूबाट"), 
    HARUBAATA_3("हरुवाट"), 
    HARUBAATA_4("हरूवाट"), 
    HARUDWARA_1("हरुद्धारा"),
    HARUDWARA_2("हरूद्धारा"),
    HARUKA_1("हरुका"),
    HARUKA_2("हरूका"),
    HARUKO_1("हरुको"),
    HARUKO_2("हरूको"),
    HARULAI_1("हरुलाइ"), 
    HARULAI_2("हरूलाइ"), 
    HARULAI_3("हरुलाई"), 
    HARULAI_4("हरूलाई"), 
    HARULE_1("हरुले"),
    HARULE_2("हरूले"),
    HARUMA_1("हरुमा"), 
    HARUMA_2("हरूमा"),
    HARUMAI_1("हरुमै"), 
    HARUMAI_2("हरूमै"),
    HARUSAMMA_1("हरुसम्म"),
    HARUSAMMA_2("हरूसम्म"),
    HARUSAMMA_MA_1("हरुसम्ममा"),
    HARUSAMMA_MA_2("हरूसम्ममा"),
    HARUSAMMAI_1("हरुसम्मै"),
    HARUSAMMAI_2("हरूसम्मै"),
    HARUSITA_1("हरुसित"),
    HARUSITA_2("हरूसित"),
    HARUSITAI_1("हरुसितै"),
    HARUSITAI_2("हरूसितै"),
    JANYA("जन्य"),
    JASTA("जस्ता"),
    JASTAI("जस्तै"),
    JASTO("जस्तो"),
    JATI("जति"),
    JHAIN("झैं"),
    JI_HARU_1("जिहरू"),
    JI_HARU_2("जीहरू"),
    JI_HARU_3("जिहरु"),
    JI_HARU_4("जीहरु"),
    JI_KAI("जीकै"),
    JI_KO("जीको"),
    JI_LE("जीले"),
    JYU_1("ज्यु"),
    JYU_2("ज्यू"),
    JYU_HARU_1("ज्युहरू"),
    JYU_HARU_2("ज्यूहरू"),
    JYU_HARU_3("ज्युहरु"),
    JYU_HARU_4("ज्यूहरु"),
    JYU_KAI("ज्युकै"),
    JYU_KO("ज्युको"),
    JYU_LE("ज्युले"),
    KA("का"),
    KAARI("कारी"),//E.G. BINASKARI
    KAHAN_1("कहाँ"),
    KAHAN_2("कहां"),
    KAHAN_3("काहाँ"),
    KAHAN_4("काहां"),
    KAI("कै"),
    KEE("की"),
    KHALKO("खालको"),
    KO("को"),
    KO_LAGI("कोलागी"),
    LAEE("लाई"),
    LAGAYAT("लगायत"),
    LAGAYAT_LE("लगायतले"),
    LAGAYATKA("लगायतका"),
    LAGAYATKO("लगायतको"),
    LAGAYATMA("लगायतमा"),
    LAGAYET("लगाएत"),
    LAGAYET_LE("लगाएतले"),
    LAGAYETKA("लगाएतका"),
    LAGAYETKO("लगाएतको"),
    LAGAYETMA("लगाएतमा"),
    LAI("लाइ"),
    LE("ले"),
    MA("मा"),
    MADHYA("मध्य"),
    MADHYAKA("मध्येका"),
    MADHYE("मध्ये"),
    MADHYEKA("मध्यका"),
    MAI("मै"),
    MAJHA("माझ"),
    MAJHAI("माझै"),
    MARPHAT("मार्फत"),
    MARPHATAI("मार्फतै"),
    MATHEE("माथी"),
    MATHEEKO("माथीको"),
    MATHI("माथि"),
    MATHIKO("माथिको"),
    MATRAI("मात्रै"),
    MAYA("मय"),
    MOOLAK_1("मुलक"),
    MOOLAK_2("मूलक"),
    MUKHI("मुखी"),
    MUNI_1("मुनि"),
    MUNI_2("मुनी"),
    MUNTIRA("मुन्तिर"),
    PAARI_1("पारी"),
    PAARI_2("पारि"),
    PACHHI_1("पछि"),
    PACHHI_2("पछी"),
    PACHHI_KO_1("पछिको"),
    PACHHI_KO_2("पछीको"),
    PACHHIKA("पछिका"),
    PALTA("पल्ट"),
    PARNE("पर्ने"),
    PASCHAT_1("पश्चात"),
    PASCHAT_2("पस्चात"),
    PASCHAT_3("पश्चात्"),
    PATAK("पटक"),
    POORBA_1("पूर्व"),
    POORBA_2("पुर्व"),
    POORBA_3("पुर्ब"),
    POORBA_4("पूर्ब"),
    POORBA_KAI_1("पूर्वकै"),
    POORBA_KAI_2("पुर्वकै"),
    POORBA_KAI_3("पुर्बकै"),
    POORBA_KAI_4("पूर्बकै"),
    POORBAK_1("पुर्बक"),
    POORBAK_2("पूर्बक"),
    POORBAK_3("पुर्वक"),
    POORBAK_4("पूर्वक"),
    PRATI("प्रति"),
    PURNA_1("पूर्ण"), 
    PURNA_2("पुर्ण"),
    RAHEKA_HARU_1("रहेकाहरू"),
    RAHEKA_HARU_2("रहेकाहरु"),
    RAKHEKO("राखेको"),
    ROOP_LE_1("रुपले"),
    ROOP_LE_2("रूपले"),
    ROOP_MA_1("रुपमा"),
    ROOP_MA_2("रूपमा"),
    SAATH("साथ"),
    SAATHAI("साथै"),
    SAHIT("सहित"),
    SAHITAI("सहितै"),
    SAHITKA_1("सहितका"),
    SAHITKA_2("सहीतका"),
    SAKEKA("सकेका"),
    SAKEKO("सकेको"),
    SAMAKSHA("समक्ष"),
    SAMBANDHI("सम्बन्धी"),
    SAMET("समेत"),
    SAMETAI("समेतै"),
    SAMMA("सम्म"),
    SAMMAI("सम्मै"),
    SAMMAKO("सम्मको"),
    SAMMALE("सम्मले"),
    SAMMAMA("सम्ममा"),
    SAMU_1("सामु"),
    SANGA_1("सँग"),
    SANGA_2("संग"),
    SANGA_3("सङ्ग"),
    SANGAI_1("संगै"),
    SANGAI_2("सँगै"),
    SANGAI_3("सङ्गै"),
    SANGAKO("संगको"),
    SHEEL("शील"),
    STHIT("स्थित"), 
    TARFA("तर्फ"),
    TARFAKO("तर्फको"),
    TEERA("तीर"),
    TIRA("तिर"),
    VAAREMA_1("वारेमा"),
    VARE("वारे"),
    VATA("वाट"),
    VEECH("वीच"),
    VICH("विच"),
    VIHEEN("विहीन"),
    VIHIN("विहिन"), 
    VINAA_KA("विनाका"),
    VIRUDDA_1("विरुद्द"),
    VIRUDDA_2("विरूद्द"),
    VIRUDDA_KO_1("विरुद्दको"),
    VIRUDDA_KO_२("विरूद्दको"),
    VIRUDDHA("विरुद्ध"),
    WAARI_1("वारि"),
    WAARI_2("वारी"),
    WAASI_1("वासी"),
    WAASI_2("वासि"),
    YOS_1("योस"),
    YOS_2("योस्"),
    HUNUKA("हुनुका"),
    HUNUKO("हुनको"),
    JATTIKAI("जत्तिकै"),
    SAMETLAI_001("समेतलाई"),
    SAMETLAI_002("समेतलाइ"),
    BINA_KO_001("बिनाको"),
    BINA_KO__002("विनाको"),
    PATTI_001("पट्टि"),
    PATTI_002("पट्टी"),
    PATTIKO_001("पट्टिको"),
    PATTIKO_002("पट्टीको"),
    PACHHADI_001("पछाडि"),
    PACHHADI_002("पछाडी"),
    PACHHADI_KO_001("पछाडिको"),
    PACHHADI_KO_002("पछाडीको"),
    BARE_KO_001("बारेको"),
    BARE_KO_002("वारेको"),
    BARE_MA_001("बारेमा"),
    BARE_MA_002("वारेमा"),
    MASTIRA("मास्तिर"),
    YUKTA("युक्त");
    
	/*
	 * भाव अघि बित्तिकैदेखि   रोल्पावासी Yatra
	 * चोटिमा Patak करण (e.g. Adhunikikaran, bargikaran घारणात्मक चौरको वाणी
	 * बस्न्परेको बिघटनपछिको अनुरुप तन्नाकोलागी भइसकेकाले हत्यापछाडिको
	 * verbs हुन्छ गाउछौं / उभिन्छौं जोडीएर पछुताउँथे नछुट्टाएर होइनन / गासिए
	 * बिर्सिदिन्छु देवकोटाजीकै साबिकै अधिनायकत्व
	 * 
	 *  
Haruki
Rupma
दोहोरोपनका 
करण
विज्ञ
कर्ता
बादी
बाद
वाण

उपचारात्मक
गाथा 
दुष्परिणाम

Words ending in Une --> Bisheshan?
	 */

	private String nepaliWordEnding;

	CompoundWordEnding(String nepaliWordEnding) {

		this.nepaliWordEnding = nepaliWordEnding;
	}

	public String getNepaliWordEnding() {

		return nepaliWordEnding;
	}
	
}
