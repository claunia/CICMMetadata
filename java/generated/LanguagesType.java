//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.1-b171012.0423 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.22 a las 11:59:16 PM BST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LanguagesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LanguagesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Language" maxOccurs="unbounded"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="aar"/&gt;
 *               &lt;enumeration value="abk"/&gt;
 *               &lt;enumeration value="ace"/&gt;
 *               &lt;enumeration value="ach"/&gt;
 *               &lt;enumeration value="ada"/&gt;
 *               &lt;enumeration value="ady"/&gt;
 *               &lt;enumeration value="afa"/&gt;
 *               &lt;enumeration value="afh"/&gt;
 *               &lt;enumeration value="afr"/&gt;
 *               &lt;enumeration value="ain"/&gt;
 *               &lt;enumeration value="aka"/&gt;
 *               &lt;enumeration value="akk"/&gt;
 *               &lt;enumeration value="alb"/&gt;
 *               &lt;enumeration value="ale"/&gt;
 *               &lt;enumeration value="alg"/&gt;
 *               &lt;enumeration value="alt"/&gt;
 *               &lt;enumeration value="amh"/&gt;
 *               &lt;enumeration value="ang"/&gt;
 *               &lt;enumeration value="anp"/&gt;
 *               &lt;enumeration value="apa"/&gt;
 *               &lt;enumeration value="ara"/&gt;
 *               &lt;enumeration value="arc"/&gt;
 *               &lt;enumeration value="arg"/&gt;
 *               &lt;enumeration value="arm"/&gt;
 *               &lt;enumeration value="arn"/&gt;
 *               &lt;enumeration value="arp"/&gt;
 *               &lt;enumeration value="art"/&gt;
 *               &lt;enumeration value="arw"/&gt;
 *               &lt;enumeration value="asm"/&gt;
 *               &lt;enumeration value="ast"/&gt;
 *               &lt;enumeration value="ath"/&gt;
 *               &lt;enumeration value="aus"/&gt;
 *               &lt;enumeration value="ava"/&gt;
 *               &lt;enumeration value="ave"/&gt;
 *               &lt;enumeration value="awa"/&gt;
 *               &lt;enumeration value="aym"/&gt;
 *               &lt;enumeration value="aze"/&gt;
 *               &lt;enumeration value="bad"/&gt;
 *               &lt;enumeration value="bai"/&gt;
 *               &lt;enumeration value="bak"/&gt;
 *               &lt;enumeration value="bal"/&gt;
 *               &lt;enumeration value="bam"/&gt;
 *               &lt;enumeration value="ban"/&gt;
 *               &lt;enumeration value="baq"/&gt;
 *               &lt;enumeration value="bas"/&gt;
 *               &lt;enumeration value="bat"/&gt;
 *               &lt;enumeration value="bej"/&gt;
 *               &lt;enumeration value="bel"/&gt;
 *               &lt;enumeration value="bem"/&gt;
 *               &lt;enumeration value="ben"/&gt;
 *               &lt;enumeration value="ber"/&gt;
 *               &lt;enumeration value="bho"/&gt;
 *               &lt;enumeration value="bih"/&gt;
 *               &lt;enumeration value="bik"/&gt;
 *               &lt;enumeration value="bin"/&gt;
 *               &lt;enumeration value="bis"/&gt;
 *               &lt;enumeration value="bla"/&gt;
 *               &lt;enumeration value="bnt"/&gt;
 *               &lt;enumeration value="bos"/&gt;
 *               &lt;enumeration value="bra"/&gt;
 *               &lt;enumeration value="bre"/&gt;
 *               &lt;enumeration value="btk"/&gt;
 *               &lt;enumeration value="bua"/&gt;
 *               &lt;enumeration value="bug"/&gt;
 *               &lt;enumeration value="bul"/&gt;
 *               &lt;enumeration value="bur"/&gt;
 *               &lt;enumeration value="byn"/&gt;
 *               &lt;enumeration value="cad"/&gt;
 *               &lt;enumeration value="cai"/&gt;
 *               &lt;enumeration value="car"/&gt;
 *               &lt;enumeration value="cat"/&gt;
 *               &lt;enumeration value="cau"/&gt;
 *               &lt;enumeration value="ceb"/&gt;
 *               &lt;enumeration value="cel"/&gt;
 *               &lt;enumeration value="cha"/&gt;
 *               &lt;enumeration value="chb"/&gt;
 *               &lt;enumeration value="che"/&gt;
 *               &lt;enumeration value="chg"/&gt;
 *               &lt;enumeration value="chi"/&gt;
 *               &lt;enumeration value="chk"/&gt;
 *               &lt;enumeration value="chm"/&gt;
 *               &lt;enumeration value="chn"/&gt;
 *               &lt;enumeration value="cho"/&gt;
 *               &lt;enumeration value="chp"/&gt;
 *               &lt;enumeration value="chr"/&gt;
 *               &lt;enumeration value="chu"/&gt;
 *               &lt;enumeration value="chv"/&gt;
 *               &lt;enumeration value="chy"/&gt;
 *               &lt;enumeration value="cmc"/&gt;
 *               &lt;enumeration value="cop"/&gt;
 *               &lt;enumeration value="cor"/&gt;
 *               &lt;enumeration value="cos"/&gt;
 *               &lt;enumeration value="cpe"/&gt;
 *               &lt;enumeration value="cpf"/&gt;
 *               &lt;enumeration value="cpp"/&gt;
 *               &lt;enumeration value="cre"/&gt;
 *               &lt;enumeration value="crh"/&gt;
 *               &lt;enumeration value="crp"/&gt;
 *               &lt;enumeration value="csb"/&gt;
 *               &lt;enumeration value="cus"/&gt;
 *               &lt;enumeration value="cze"/&gt;
 *               &lt;enumeration value="dak"/&gt;
 *               &lt;enumeration value="dan"/&gt;
 *               &lt;enumeration value="dar"/&gt;
 *               &lt;enumeration value="day"/&gt;
 *               &lt;enumeration value="del"/&gt;
 *               &lt;enumeration value="den"/&gt;
 *               &lt;enumeration value="dgr"/&gt;
 *               &lt;enumeration value="din"/&gt;
 *               &lt;enumeration value="div"/&gt;
 *               &lt;enumeration value="doi"/&gt;
 *               &lt;enumeration value="dra"/&gt;
 *               &lt;enumeration value="dsb"/&gt;
 *               &lt;enumeration value="dua"/&gt;
 *               &lt;enumeration value="dum"/&gt;
 *               &lt;enumeration value="dut"/&gt;
 *               &lt;enumeration value="dyu"/&gt;
 *               &lt;enumeration value="dzo"/&gt;
 *               &lt;enumeration value="efi"/&gt;
 *               &lt;enumeration value="egy"/&gt;
 *               &lt;enumeration value="eka"/&gt;
 *               &lt;enumeration value="elx"/&gt;
 *               &lt;enumeration value="eng"/&gt;
 *               &lt;enumeration value="enm"/&gt;
 *               &lt;enumeration value="epo"/&gt;
 *               &lt;enumeration value="est"/&gt;
 *               &lt;enumeration value="ewe"/&gt;
 *               &lt;enumeration value="ewo"/&gt;
 *               &lt;enumeration value="fan"/&gt;
 *               &lt;enumeration value="fao"/&gt;
 *               &lt;enumeration value="fat"/&gt;
 *               &lt;enumeration value="fij"/&gt;
 *               &lt;enumeration value="fil"/&gt;
 *               &lt;enumeration value="fin"/&gt;
 *               &lt;enumeration value="fiu"/&gt;
 *               &lt;enumeration value="fon"/&gt;
 *               &lt;enumeration value="fre"/&gt;
 *               &lt;enumeration value="frm"/&gt;
 *               &lt;enumeration value="fro"/&gt;
 *               &lt;enumeration value="frr"/&gt;
 *               &lt;enumeration value="frs"/&gt;
 *               &lt;enumeration value="fry"/&gt;
 *               &lt;enumeration value="ful"/&gt;
 *               &lt;enumeration value="fur"/&gt;
 *               &lt;enumeration value="gaa"/&gt;
 *               &lt;enumeration value="gay"/&gt;
 *               &lt;enumeration value="gba"/&gt;
 *               &lt;enumeration value="gem"/&gt;
 *               &lt;enumeration value="geo"/&gt;
 *               &lt;enumeration value="ger"/&gt;
 *               &lt;enumeration value="gez"/&gt;
 *               &lt;enumeration value="gil"/&gt;
 *               &lt;enumeration value="gla"/&gt;
 *               &lt;enumeration value="gle"/&gt;
 *               &lt;enumeration value="glg"/&gt;
 *               &lt;enumeration value="glv"/&gt;
 *               &lt;enumeration value="gmh"/&gt;
 *               &lt;enumeration value="goh"/&gt;
 *               &lt;enumeration value="gon"/&gt;
 *               &lt;enumeration value="gor"/&gt;
 *               &lt;enumeration value="got"/&gt;
 *               &lt;enumeration value="grb"/&gt;
 *               &lt;enumeration value="grc"/&gt;
 *               &lt;enumeration value="gre"/&gt;
 *               &lt;enumeration value="grn"/&gt;
 *               &lt;enumeration value="gsw"/&gt;
 *               &lt;enumeration value="guj"/&gt;
 *               &lt;enumeration value="gwi"/&gt;
 *               &lt;enumeration value="hai"/&gt;
 *               &lt;enumeration value="hat"/&gt;
 *               &lt;enumeration value="hau"/&gt;
 *               &lt;enumeration value="haw"/&gt;
 *               &lt;enumeration value="heb"/&gt;
 *               &lt;enumeration value="her"/&gt;
 *               &lt;enumeration value="hil"/&gt;
 *               &lt;enumeration value="him"/&gt;
 *               &lt;enumeration value="hin"/&gt;
 *               &lt;enumeration value="hit"/&gt;
 *               &lt;enumeration value="hmn"/&gt;
 *               &lt;enumeration value="hmo"/&gt;
 *               &lt;enumeration value="hrv"/&gt;
 *               &lt;enumeration value="hsb"/&gt;
 *               &lt;enumeration value="hun"/&gt;
 *               &lt;enumeration value="hup"/&gt;
 *               &lt;enumeration value="iba"/&gt;
 *               &lt;enumeration value="ibo"/&gt;
 *               &lt;enumeration value="ice"/&gt;
 *               &lt;enumeration value="ido"/&gt;
 *               &lt;enumeration value="iii"/&gt;
 *               &lt;enumeration value="ijo"/&gt;
 *               &lt;enumeration value="iku"/&gt;
 *               &lt;enumeration value="ile"/&gt;
 *               &lt;enumeration value="ilo"/&gt;
 *               &lt;enumeration value="ina"/&gt;
 *               &lt;enumeration value="inc"/&gt;
 *               &lt;enumeration value="ind"/&gt;
 *               &lt;enumeration value="ine"/&gt;
 *               &lt;enumeration value="inh"/&gt;
 *               &lt;enumeration value="ipk"/&gt;
 *               &lt;enumeration value="ira"/&gt;
 *               &lt;enumeration value="iro"/&gt;
 *               &lt;enumeration value="ita"/&gt;
 *               &lt;enumeration value="jav"/&gt;
 *               &lt;enumeration value="jbo"/&gt;
 *               &lt;enumeration value="jpn"/&gt;
 *               &lt;enumeration value="jpr"/&gt;
 *               &lt;enumeration value="jrb"/&gt;
 *               &lt;enumeration value="kaa"/&gt;
 *               &lt;enumeration value="kab"/&gt;
 *               &lt;enumeration value="kac"/&gt;
 *               &lt;enumeration value="kal"/&gt;
 *               &lt;enumeration value="kam"/&gt;
 *               &lt;enumeration value="kan"/&gt;
 *               &lt;enumeration value="kar"/&gt;
 *               &lt;enumeration value="kas"/&gt;
 *               &lt;enumeration value="kau"/&gt;
 *               &lt;enumeration value="kaw"/&gt;
 *               &lt;enumeration value="kaz"/&gt;
 *               &lt;enumeration value="kbd"/&gt;
 *               &lt;enumeration value="kha"/&gt;
 *               &lt;enumeration value="khi"/&gt;
 *               &lt;enumeration value="khm"/&gt;
 *               &lt;enumeration value="kho"/&gt;
 *               &lt;enumeration value="kik"/&gt;
 *               &lt;enumeration value="kin"/&gt;
 *               &lt;enumeration value="kir"/&gt;
 *               &lt;enumeration value="kmb"/&gt;
 *               &lt;enumeration value="kok"/&gt;
 *               &lt;enumeration value="kom"/&gt;
 *               &lt;enumeration value="kon"/&gt;
 *               &lt;enumeration value="kor"/&gt;
 *               &lt;enumeration value="kos"/&gt;
 *               &lt;enumeration value="kpe"/&gt;
 *               &lt;enumeration value="krc"/&gt;
 *               &lt;enumeration value="krl"/&gt;
 *               &lt;enumeration value="kro"/&gt;
 *               &lt;enumeration value="kru"/&gt;
 *               &lt;enumeration value="kua"/&gt;
 *               &lt;enumeration value="kum"/&gt;
 *               &lt;enumeration value="kur"/&gt;
 *               &lt;enumeration value="kut"/&gt;
 *               &lt;enumeration value="lad"/&gt;
 *               &lt;enumeration value="lah"/&gt;
 *               &lt;enumeration value="lam"/&gt;
 *               &lt;enumeration value="lao"/&gt;
 *               &lt;enumeration value="lat"/&gt;
 *               &lt;enumeration value="lav"/&gt;
 *               &lt;enumeration value="lez"/&gt;
 *               &lt;enumeration value="lim"/&gt;
 *               &lt;enumeration value="lin"/&gt;
 *               &lt;enumeration value="lit"/&gt;
 *               &lt;enumeration value="lol"/&gt;
 *               &lt;enumeration value="loz"/&gt;
 *               &lt;enumeration value="ltz"/&gt;
 *               &lt;enumeration value="lua"/&gt;
 *               &lt;enumeration value="lub"/&gt;
 *               &lt;enumeration value="lug"/&gt;
 *               &lt;enumeration value="lui"/&gt;
 *               &lt;enumeration value="lun"/&gt;
 *               &lt;enumeration value="luo"/&gt;
 *               &lt;enumeration value="lus"/&gt;
 *               &lt;enumeration value="mac"/&gt;
 *               &lt;enumeration value="mad"/&gt;
 *               &lt;enumeration value="mag"/&gt;
 *               &lt;enumeration value="mah"/&gt;
 *               &lt;enumeration value="mai"/&gt;
 *               &lt;enumeration value="mak"/&gt;
 *               &lt;enumeration value="mal"/&gt;
 *               &lt;enumeration value="man"/&gt;
 *               &lt;enumeration value="mao"/&gt;
 *               &lt;enumeration value="map"/&gt;
 *               &lt;enumeration value="mar"/&gt;
 *               &lt;enumeration value="mas"/&gt;
 *               &lt;enumeration value="may"/&gt;
 *               &lt;enumeration value="mdf"/&gt;
 *               &lt;enumeration value="mdr"/&gt;
 *               &lt;enumeration value="men"/&gt;
 *               &lt;enumeration value="mga"/&gt;
 *               &lt;enumeration value="mic"/&gt;
 *               &lt;enumeration value="min"/&gt;
 *               &lt;enumeration value="mis"/&gt;
 *               &lt;enumeration value="mkh"/&gt;
 *               &lt;enumeration value="mlg"/&gt;
 *               &lt;enumeration value="mlt"/&gt;
 *               &lt;enumeration value="mnc"/&gt;
 *               &lt;enumeration value="mni"/&gt;
 *               &lt;enumeration value="mno"/&gt;
 *               &lt;enumeration value="moh"/&gt;
 *               &lt;enumeration value="mon"/&gt;
 *               &lt;enumeration value="mos"/&gt;
 *               &lt;enumeration value="mul"/&gt;
 *               &lt;enumeration value="mun"/&gt;
 *               &lt;enumeration value="mus"/&gt;
 *               &lt;enumeration value="mwl"/&gt;
 *               &lt;enumeration value="mwr"/&gt;
 *               &lt;enumeration value="myn"/&gt;
 *               &lt;enumeration value="myv"/&gt;
 *               &lt;enumeration value="nah"/&gt;
 *               &lt;enumeration value="nai"/&gt;
 *               &lt;enumeration value="nap"/&gt;
 *               &lt;enumeration value="nau"/&gt;
 *               &lt;enumeration value="nav"/&gt;
 *               &lt;enumeration value="nbl"/&gt;
 *               &lt;enumeration value="nde"/&gt;
 *               &lt;enumeration value="ndo"/&gt;
 *               &lt;enumeration value="nds"/&gt;
 *               &lt;enumeration value="nep"/&gt;
 *               &lt;enumeration value="new"/&gt;
 *               &lt;enumeration value="nia"/&gt;
 *               &lt;enumeration value="nic"/&gt;
 *               &lt;enumeration value="niu"/&gt;
 *               &lt;enumeration value="nno"/&gt;
 *               &lt;enumeration value="nob"/&gt;
 *               &lt;enumeration value="nog"/&gt;
 *               &lt;enumeration value="non"/&gt;
 *               &lt;enumeration value="nor"/&gt;
 *               &lt;enumeration value="nqo"/&gt;
 *               &lt;enumeration value="nso"/&gt;
 *               &lt;enumeration value="nub"/&gt;
 *               &lt;enumeration value="nwc"/&gt;
 *               &lt;enumeration value="nya"/&gt;
 *               &lt;enumeration value="nym"/&gt;
 *               &lt;enumeration value="nyn"/&gt;
 *               &lt;enumeration value="nyo"/&gt;
 *               &lt;enumeration value="nzi"/&gt;
 *               &lt;enumeration value="oci"/&gt;
 *               &lt;enumeration value="oji"/&gt;
 *               &lt;enumeration value="ori"/&gt;
 *               &lt;enumeration value="orm"/&gt;
 *               &lt;enumeration value="osa"/&gt;
 *               &lt;enumeration value="oss"/&gt;
 *               &lt;enumeration value="ota"/&gt;
 *               &lt;enumeration value="oto"/&gt;
 *               &lt;enumeration value="paa"/&gt;
 *               &lt;enumeration value="pag"/&gt;
 *               &lt;enumeration value="pal"/&gt;
 *               &lt;enumeration value="pam"/&gt;
 *               &lt;enumeration value="pan"/&gt;
 *               &lt;enumeration value="pap"/&gt;
 *               &lt;enumeration value="pau"/&gt;
 *               &lt;enumeration value="peo"/&gt;
 *               &lt;enumeration value="per"/&gt;
 *               &lt;enumeration value="phi"/&gt;
 *               &lt;enumeration value="phn"/&gt;
 *               &lt;enumeration value="pli"/&gt;
 *               &lt;enumeration value="pol"/&gt;
 *               &lt;enumeration value="pon"/&gt;
 *               &lt;enumeration value="por"/&gt;
 *               &lt;enumeration value="pra"/&gt;
 *               &lt;enumeration value="pro"/&gt;
 *               &lt;enumeration value="pus"/&gt;
 *               &lt;enumeration value="qaa-qtz"/&gt;
 *               &lt;enumeration value="que"/&gt;
 *               &lt;enumeration value="raj"/&gt;
 *               &lt;enumeration value="rap"/&gt;
 *               &lt;enumeration value="rar"/&gt;
 *               &lt;enumeration value="roa"/&gt;
 *               &lt;enumeration value="roh"/&gt;
 *               &lt;enumeration value="rom"/&gt;
 *               &lt;enumeration value="rum"/&gt;
 *               &lt;enumeration value="run"/&gt;
 *               &lt;enumeration value="rup"/&gt;
 *               &lt;enumeration value="rus"/&gt;
 *               &lt;enumeration value="sad"/&gt;
 *               &lt;enumeration value="sag"/&gt;
 *               &lt;enumeration value="sah"/&gt;
 *               &lt;enumeration value="sai"/&gt;
 *               &lt;enumeration value="sal"/&gt;
 *               &lt;enumeration value="sam"/&gt;
 *               &lt;enumeration value="san"/&gt;
 *               &lt;enumeration value="sas"/&gt;
 *               &lt;enumeration value="sat"/&gt;
 *               &lt;enumeration value="scn"/&gt;
 *               &lt;enumeration value="sco"/&gt;
 *               &lt;enumeration value="sel"/&gt;
 *               &lt;enumeration value="sem"/&gt;
 *               &lt;enumeration value="sga"/&gt;
 *               &lt;enumeration value="sgn"/&gt;
 *               &lt;enumeration value="shn"/&gt;
 *               &lt;enumeration value="sid"/&gt;
 *               &lt;enumeration value="sin"/&gt;
 *               &lt;enumeration value="sio"/&gt;
 *               &lt;enumeration value="sit"/&gt;
 *               &lt;enumeration value="sla"/&gt;
 *               &lt;enumeration value="slo"/&gt;
 *               &lt;enumeration value="slv"/&gt;
 *               &lt;enumeration value="sma"/&gt;
 *               &lt;enumeration value="sme"/&gt;
 *               &lt;enumeration value="smi"/&gt;
 *               &lt;enumeration value="smj"/&gt;
 *               &lt;enumeration value="smn"/&gt;
 *               &lt;enumeration value="smo"/&gt;
 *               &lt;enumeration value="sms"/&gt;
 *               &lt;enumeration value="sna"/&gt;
 *               &lt;enumeration value="snd"/&gt;
 *               &lt;enumeration value="snk"/&gt;
 *               &lt;enumeration value="sog"/&gt;
 *               &lt;enumeration value="som"/&gt;
 *               &lt;enumeration value="son"/&gt;
 *               &lt;enumeration value="sot"/&gt;
 *               &lt;enumeration value="spa"/&gt;
 *               &lt;enumeration value="srd"/&gt;
 *               &lt;enumeration value="srn"/&gt;
 *               &lt;enumeration value="srp"/&gt;
 *               &lt;enumeration value="srr"/&gt;
 *               &lt;enumeration value="ssa"/&gt;
 *               &lt;enumeration value="ssw"/&gt;
 *               &lt;enumeration value="suk"/&gt;
 *               &lt;enumeration value="sun"/&gt;
 *               &lt;enumeration value="sus"/&gt;
 *               &lt;enumeration value="sux"/&gt;
 *               &lt;enumeration value="swa"/&gt;
 *               &lt;enumeration value="swe"/&gt;
 *               &lt;enumeration value="syc"/&gt;
 *               &lt;enumeration value="syr"/&gt;
 *               &lt;enumeration value="tah"/&gt;
 *               &lt;enumeration value="tai"/&gt;
 *               &lt;enumeration value="tam"/&gt;
 *               &lt;enumeration value="tat"/&gt;
 *               &lt;enumeration value="tel"/&gt;
 *               &lt;enumeration value="tem"/&gt;
 *               &lt;enumeration value="ter"/&gt;
 *               &lt;enumeration value="tet"/&gt;
 *               &lt;enumeration value="tgk"/&gt;
 *               &lt;enumeration value="tgl"/&gt;
 *               &lt;enumeration value="tha"/&gt;
 *               &lt;enumeration value="tib"/&gt;
 *               &lt;enumeration value="tig"/&gt;
 *               &lt;enumeration value="tir"/&gt;
 *               &lt;enumeration value="tiv"/&gt;
 *               &lt;enumeration value="tkl"/&gt;
 *               &lt;enumeration value="tlh"/&gt;
 *               &lt;enumeration value="tli"/&gt;
 *               &lt;enumeration value="tmh"/&gt;
 *               &lt;enumeration value="tog"/&gt;
 *               &lt;enumeration value="ton"/&gt;
 *               &lt;enumeration value="tpi"/&gt;
 *               &lt;enumeration value="tsi"/&gt;
 *               &lt;enumeration value="tsn"/&gt;
 *               &lt;enumeration value="tso"/&gt;
 *               &lt;enumeration value="tuk"/&gt;
 *               &lt;enumeration value="tum"/&gt;
 *               &lt;enumeration value="tup"/&gt;
 *               &lt;enumeration value="tur"/&gt;
 *               &lt;enumeration value="tut"/&gt;
 *               &lt;enumeration value="tvl"/&gt;
 *               &lt;enumeration value="twi"/&gt;
 *               &lt;enumeration value="tyv"/&gt;
 *               &lt;enumeration value="udm"/&gt;
 *               &lt;enumeration value="uga"/&gt;
 *               &lt;enumeration value="uig"/&gt;
 *               &lt;enumeration value="ukr"/&gt;
 *               &lt;enumeration value="umb"/&gt;
 *               &lt;enumeration value="und"/&gt;
 *               &lt;enumeration value="urd"/&gt;
 *               &lt;enumeration value="uzb"/&gt;
 *               &lt;enumeration value="vai"/&gt;
 *               &lt;enumeration value="ven"/&gt;
 *               &lt;enumeration value="vie"/&gt;
 *               &lt;enumeration value="vol"/&gt;
 *               &lt;enumeration value="vot"/&gt;
 *               &lt;enumeration value="wak"/&gt;
 *               &lt;enumeration value="wal"/&gt;
 *               &lt;enumeration value="war"/&gt;
 *               &lt;enumeration value="was"/&gt;
 *               &lt;enumeration value="wel"/&gt;
 *               &lt;enumeration value="wen"/&gt;
 *               &lt;enumeration value="wln"/&gt;
 *               &lt;enumeration value="wol"/&gt;
 *               &lt;enumeration value="xal"/&gt;
 *               &lt;enumeration value="xho"/&gt;
 *               &lt;enumeration value="yao"/&gt;
 *               &lt;enumeration value="yap"/&gt;
 *               &lt;enumeration value="yid"/&gt;
 *               &lt;enumeration value="yor"/&gt;
 *               &lt;enumeration value="ypk"/&gt;
 *               &lt;enumeration value="zap"/&gt;
 *               &lt;enumeration value="zbl"/&gt;
 *               &lt;enumeration value="zen"/&gt;
 *               &lt;enumeration value="zgh"/&gt;
 *               &lt;enumeration value="zha"/&gt;
 *               &lt;enumeration value="znd"/&gt;
 *               &lt;enumeration value="zul"/&gt;
 *               &lt;enumeration value="zun"/&gt;
 *               &lt;enumeration value="zxx"/&gt;
 *               &lt;enumeration value="zza"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguagesType", propOrder = {
    "language"
})
public class LanguagesType {

    @XmlElement(name = "Language", required = true)
    protected List<String> language;

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLanguage() {
        if (language == null) {
            language = new ArrayList<String>();
        }
        return this.language;
    }

}
