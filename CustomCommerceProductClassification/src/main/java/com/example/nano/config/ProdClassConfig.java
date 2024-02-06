package com.example.nano.config;

public final class ProdClassConfig {
	private static final String CANNOT_INSTANTIATE = "Cannot Instantiate";

	private ProdClassConfig() throws IllegalAccessException {
		// no-op
		throw new IllegalAccessException(CANNOT_INSTANTIATE);
	}

	public final class EUMDDConfig {

		private EUMDDConfig() throws IllegalAccessException {
			throw new IllegalAccessException(CANNOT_INSTANTIATE);
		}

		public static final String CLASS_I_CODE = "Class I";
		public static final String CLASS_I_NOTES = "The device is the lowest risk class. "
				+ "The manufacturer self-certifies the device. The route to conformity assessment for Class I self-certified medical devices is Annex VII of the MDD 93/42/EEC. "
				+ "The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_IIA_CODE = "Class IIa";
		public static final String CLASS_IIA_NOTES = "The device requires Notified Body involvement (Article 11(2)). "
				+ "The route to conformity assessment for Class IIa medical devices is Annex VII plus Annex IV, V, or VI of the MDD 93/42/EEC or Annex II, excluding Section 4 of the MDD 93/42/EEC. "
				+ "Most manufacturers apply Annex II, excluding Section 4 and upon successful review the Notified Body would issue a CE marking certificate. "
				+ "The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_IIB_CODE = "Class IIb";
		public static final String CLASS_IIB_NOTES = "The device requires Notified Body involvement (Article 11(3)). "
				+ "The route to conformity assessment for Class IIb medical devices is Annex II, excluding Section 4 of the MDD 93/42/EEC or Annex III plus Annex IV, V, or VI of the MDD 93/42/EEC. "
				+ "Most manufacturers apply Annex II, excluding Section 4 and upon successful review the Notified Body would issue a CE marking certificate. "
				+ "The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_III_CODE = "Class III";
		public static final String CLASS_III_NOTES = "The device requires Notified Body involvement (Article 11(1)). "
				+ "The route to conformity assessment for Class III medical devices is Annex II Section 4 or Annex III plus Annex IV or V of the MDD 93/42/EEC. "
				+ "Most manufacturers apply Annex II, Section 4 and upon successful review the Notified Body would issue a CE marking certificate. "
				+ "The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_IM_CODE = "Class I m"; // Class I measuring
		public static final String CLASS_IM_NOTES = "The device requires Notified Body involvement to review the elements related to the manufacture of products in conformity "
				+ "with meterological requirements (Article 52(7)(b)). "
				+ "The route to conformity assessment for Class I measuring medical devices is Chapters I and III of Annex IX or Part A of Annex XI of the Medical Devices "
				+ "Regulation (MDR) 2017/745. "
				+ "Upon successful review the Notified Body would issue a CE marking certificate. "
				+ "The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_IS_CODE = "Class I s"; // Class I sterile
		public static final String CLASS_IS_NOTES = "The device requires Notified Body involvement to review the elements related to the manufacture of products in conformity "
				+ "with securing and maintaining sterile condition (Article 52(7)(a)). "
				+ "The route to conformity assessment for Class I sterile medical devices is Chapters I and III of Annex IX or Part A of Annex XI of the Medical Devices "
				+ "Regulation (MDR) 2017/745. "
				+ "Upon successful review the Notified Body would issue a CE marking certificate."
				+ "The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_ISM_CODE = "Class I sm"; // Class I sterile and measuring
		public static final String CLASS_ISM_NOTES = "The device requires Notified Body involvement to review the elements related to the manufacture of products in conformity "
				+ "with securing and maintaining sterile condition (Article 52(7)(a)) as well as the manufacture of products in conformity with meterological "
				+ "requirements (Article 52(7)(b)). "
				+ "The route to conformity assessment for Class I sterile and measuring medical devices is Chapters I and III of Annex IX or Part A of Annex XI of "
				+ "the Medical Devices Regulation (MDR) 2017/745. "
				+ "Upon successful review the Notified Body would issue a CE marking certificate.The regulatory requirements are described in the FAQs, "
				+ "Section Roadmap and Technical Dossier Prep";
	}

	public final class EUMDRConfig {
		private EUMDRConfig() throws IllegalAccessException {
			throw new IllegalAccessException(CANNOT_INSTANTIATE);
		}

		public static final String CLASS_I_CODE = "Class I";
		public static final String CLASS_I_NOTES = "The device is the lowest risk class. "
				+ "The manufacturer self-certifies the device by completing the Declaration of Conformity (Article 19) and the technical documentation in "
				+ "Annex II and III of the Medical Devices Regulation (MDR) 2017/745 (Article 52(7)). "
				+ "The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_IM_CODE = "Class I m"; // Class I measuring
		public static final String CLASS_IM_NOTES = "The device requires Notified Body involvement to review the elements related to the manufacture of products in conformity "
				+ "with meterological requirements (Article 52(7)(b)). "
				+ "The route to conformity assessment for Class I measuring medical devices is Chapters I and III of Annex IX or Part A of Annex XI of the Medical Devices "
				+ "Regulation (MDR) 2017/745. "
				+ "Upon successful review the Notified Body would issue a CE marking certificate. "
				+ "The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_IS_CODE = "Class I s"; // Class I sterile
		public static final String CLASS_IS_NOTES = "The device requires Notified Body involvement to review the elements related to the manufacture of products in conformity "
				+ "with securing and maintaining sterile condition (Article 52(7)(a)). "
				+ "The route to conformity assessment for Class I sterile medical devices is Chapters I and III of Annex IX or Part A of Annex XI of the Medical Devices "
				+ "Regulation (MDR) 2017/745. "
				+ "Upon successful review the Notified Body would issue a CE marking certificate."
				+ "The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_ISM_CODE = "Class I sm"; // Class I sterile and measuring
		public static final String CLASS_ISM_NOTES = "The device requires Notified Body involvement to review the elements related to the manufacture of products in conformity "
				+ "with securing and maintaining sterile condition (Article 52(7)(a)) as well as the manufacture of products in conformity with meterological "
				+ "requirements (Article 52(7)(b)). "
				+ "The route to conformity assessment for Class I sterile and measuring medical devices is Chapters I and III of Annex IX or Part A of Annex XI of "
				+ "the Medical Devices Regulation (MDR) 2017/745. "
				+ "Upon successful review the Notified Body would issue a CE marking certificate.The regulatory requirements are described in the FAQs, "
				+ "Section Roadmap and Technical Dossier Prep";

		public static final String CLASS_IR_CODE = "Class I r"; // Class I reusable surgical instrument
		public static final String CLASS_IR_NOTES = "The device requires Notified Body involvement to review the elements related to reuse of the device and the cleaning, "
				+ "disinfection, sterilization, maintenance and functional testing related to the IFU (Article 52(7)(c)). "
				+ "The route to conformity assessment for Class I reusable surgical instrument medical devices is Chapters I and III of Annex IX or Part A of Annex XI "
				+ "of the Medical Devices Regulation (MDR) 2017/745. "
				+ "Upon successful review the Notified Body would issue a CE marking certificate.The regulatory requirements are described in the FAQs, Section Roadmap "
				+ "and Technical Dossier Prep.";

		public static final String CLASS_IRM_CODE = "Class I rm"; // Class I reusable surgical instrument and measuring
		public static final String CLASS_IRM_NOTES = "The device requires Notified Body involvement to review the elements related to reuse of the device and the cleaning, "
				+ "disinfection, sterilization, maintenance and functional testing related to the IFU (Article 52(7)(c)) as well as the manufacture of products in conformity "
				+ "with meterological requirements (Article 52(7)(b)). "
				+ "The route to conformity assessment for Class I reusable surgical instrument and measuring medical devices is Chapters I and III of Annex IX or Part A of "
				+ "Annex XI of the Medical Devices Regulation (MDR) 2017/745. Upon successful review the Notified Body would issue a CE marking certificate."
				+ "The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_IIA_CODE = "Class IIa";
		public static final String CLASS_IIA_NOTES = "The device requires Notified Body involvement (Article 52(6)). "
				+ "The route to conformity assessment for Class IIa medical devices is Chapters I and III of Annex IX (including a technical assessment of the "
				+ "technical documentation in Section 4 or at least one representative device for each category of devices) or Section 10 or Section 18 of "
				+ "Annex XI (assessment of technical documentation at least one representative device for each category) of the Medical Devices Regulation (MDR) 2017/745. "
				+ "The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_IIB_CODE = "Class IIb";
		public static final String CLASS_IIB_NOTES = "The device requires Notified Body involvement (Article 52(4)). "
				+ "The route to conformity assessment for Class IIb medical devices is Chapters I and III of Annex IX (including a technical assessment of the technical "
				+ "documentation in Section 4 of at least one representative device per generic device group though for certain implantable devices this is for every device) "
				+ "or Annex X plus Annex XI of the Medical Devices Regulation (MDR) 2017/745. "
				+ "The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_III_CODE = "Class III";
		public static final String CLASS_III_NOTES = "The device requires Notified Body involvement (Article 52(3)). "
				+ "The route to conformity assessment for Class III medical devices is Annex IX or Annex X plus Annex XI of the Medical Devices Regulation (MDR) 2017/745. "
				+ "The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";
	}

	public final class SGPConfig {

		private SGPConfig() throws IllegalAccessException {
			throw new IllegalAccessException(CANNOT_INSTANTIATE);
		}

		public static final String CLASS_A_CODE = "Class A";
		public static final String CLASS_A_NOTES = "Class A devices are exempt from registration with the HSA, though compliance with the Essential Principles (Annex 1 of GN-16) is still required. Foreign manufacturers of Class A devices must appoint a licensed importer in Singapore, and the importer lists the device on their license prior to importation. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_B_CODE = "Class B";
		public static final String CLASS_B_NOTES = "Class B, C, and D devices require registration with the HSA. Several registration routes are available, and the applicable route depends on the device classification, status in reference countries, and marketing history of the device. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_C_CODE = "Class C";
		public static final String CLASS_C_NOTES = "Class B, C, and D devices require registration with the HSA. Several registration routes are available, and the applicable route depends on the device classification, status in reference countries, and marketing history of the device. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_D_CODE = "Class D";
		public static final String CLASS_D_NOTES = "Class B, C, and D devices require registration with the HSA. Several registration routes are available, and the applicable route depends on the device classification, status in reference countries, and marketing history of the device. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";
	}

	public final class AUSMDConfig {

		private AUSMDConfig() throws IllegalAccessException {
			throw new IllegalAccessException(CANNOT_INSTANTIATE);
		}

		public static final String CLASS_I_CODE = "Class I";
		public static final String CLASS_I_NOTES = "Class I (non-sterile, non-measuring) devices are self-certified.  The device must meet the Australia-specific requirements and receive an Australian Register of Therapeutic Goods (ARTG) listing number.  For self-certified devices, the Australian Declaration of Conformity (and supporting Technical File evidence) is maintained by the manufacturer as confirmation of conformity. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep";

		public static final String CLASS_I_EXP_CODE = "Class I (Export Only)";
		public static final String CLASS_I_EXP_NOTES = "Class I (Export Only) devices are self-certified. The device must meet the Australia-specific requirements and receive an Australian Register of Therapeutic Goods (ARTG) listing number. For Class I (Export Only) devices, the ARTG application is not reviewed by the TGA prior to issuance of the ARTG listing but requires a self-certification from the manufacturer that they can demonstrate that the device meets the Essential Principles. The required Declaration of Conformity (DoC) can be in any format, as long as it includes the required information and signature. The TGA offers a template DoC on their website. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep";

		public static final String CLASS_IIA_CODE = "Class IIa";
		public static final String CLASS_IIA_NOTES = "The device must meet the Australia-specific requirements and receive an Australian Register of Therapeutic Goods (ARTG) listing number. Prior to applying for an ARTG listing, evidence of conformity assessment needs to be submitted to the TGA. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_IIB_CODE = "Class IIb";
		public static final String CLASS_IIB_NOTES = "The device must meet the Australia-specific requirements and receive an Australian Register of Therapeutic Goods (ARTG) listing number. Prior to applying for an ARTG listing, evidence of conformity assessment needs to be submitted to the TGA. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_III_CODE = "Class III";
		public static final String CLASS_III_NOTES = "The device must meet the Australia-specific requirements and receive an Australian Register of Therapeutic Goods (ARTG) listing number. Prior to applying for an ARTG listing, evidence of conformity assessment needs to be submitted to the TGA. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String AIMD_CODE = "AIMD";
		public static final String AIMD_NOTES = "The device must meet the Australia-specific requirements and receive an Australian Register of Therapeutic Goods (ARTG) listing number. Prior to applying for an ARTG listing, evidence of conformity assessment needs to be submitted to the TGA. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_IM_CODE = "Class I m"; // Class I measuring
		public static final String CLASS_IM_NOTES = "The device must meet the Australia-specific requirements and receive an Australian Register of Therapeutic Goods (ARTG) listing number. Prior to applying for an ARTG listing, evidence of conformity assessment needs to be submitted to the TGA. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_IS_CODE = "Class I s"; // Class I sterile
		public static final String CLASS_IS_NOTES = "The device must meet the Australia-specific requirements and receive an Australian Register of Therapeutic Goods (ARTG) listing number. Prior to applying for an ARTG listing, evidence of conformity assessment needs to be submitted to the TGA. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_ISM_CODE = "Class I sm"; // Class I sterile and measuring
		public static final String CLASS_ISM_NOTES = "The device must meet the Australia-specific requirements and receive an Australian Register of Therapeutic Goods (ARTG) listing number. Prior to applying for an ARTG listing, evidence of conformity assessment needs to be submitted to the TGA. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";
	}

	public final class HKMDConfig {

		private HKMDConfig() throws IllegalAccessException {
			throw new IllegalAccessException(CANNOT_INSTANTIATE);
		}

		public static final String CLASS_I_CODE = "Class I";
		public static final String CLASS_I_NOTES = "Medical device registration in Hong Kong is currently voluntary. Even so, Class I devices are ineligible for voluntary listing with the MDD. They may be placed on the market without regulatory oversight. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_II_CODE = "Class II";
		public static final String CLASS_II_NOTES = "Medical device registration in Hong Kong is currently voluntary. Class II, III, and IV devices can be voluntarily registered with the MDD. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_III_CODE = "Class III";
		public static final String CLASS_III_NOTES = "Medical device registration in Hong Kong is currently voluntary. Class II, III, and IV devices can be voluntarily registered with the MDD. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_IV_CODE = "Class IV";
		public static final String CLASS_IV_NOTES = "Medical device registration in Hong Kong is currently voluntary. Class II, III, and IV devices can be voluntarily registered with the MDD. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";
	}

	public final class MalaysiaMDConfig {

		private MalaysiaMDConfig() throws IllegalAccessException {
			throw new IllegalAccessException(CANNOT_INSTANTIATE);
		}

		public static final String CLASS_A_CODE = "Class A";
		public static final String CLASS_A_NOTES = "Class A devices require registration with the MDA. However, Class A devices are exempt from the requirement for conformity assessment by a Conformity Assessment Body (CAB). The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_B_CODE = "Class B";
		public static final String CLASS_B_NOTES = "Class B, C, and D devices require conformity assessment by an accredited Conformity Assessment Body (CAB). Following conformity assessment, the device must be registered with the MDA. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_C_CODE = "Class C";
		public static final String CLASS_C_NOTES = "Class B, C, and D devices require conformity assessment by an accredited Conformity Assessment Body (CAB). Following conformity assessment, the device must be registered with the MDA. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";

		public static final String CLASS_D_CODE = "Class D";
		public static final String CLASS_D_NOTES = "Class B, C, and D devices require conformity assessment by an accredited Conformity Assessment Body (CAB). Following conformity assessment, the device must be registered with the MDA. The regulatory requirements are described in the FAQs, Section Roadmap and Technical Dossier Prep.";
	}

	public final class ColombiaMDConfig {

		private ColombiaMDConfig() throws IllegalAccessException {
			throw new IllegalAccessException(CANNOT_INSTANTIATE);
		}

		public static final String CLASS_I_CODE = "Class I";
		public static final String CLASS_I_NOTES = "The device requires registration with INVIMA. However, Class I/IIa devices are eligible for “automatic” registration, whereby approval is granted automatically upon complete submission of the required documents (subject to a subsequent review by INVIMA). The regulatory requirements are described in the FAQs, Section Roadmap, and Technical Dossier Prep.";

		public static final String CLASS_IIa_CODE = "Class IIa";
		public static final String CLASS_IIa_NOTES = "The device requires registration with INVIMA. However, Class I/IIa devices are eligible for “automatic” registration, whereby approval is granted automatically upon complete submission of the required documents (subject to a subsequent review by INVIMA). The regulatory requirements are described in the FAQs, Section Roadmap, and Technical Dossier Prep.";

		public static final String CLASS_IIb_CODE = "Class IIb";
		public static final String CLASS_IIb_NOTES = "The device requires registration with INVIMA, subject to pre-market review and approval. The regulatory requirements are described in the FAQs, Section Roadmap, and Technical Dossier Prep.";

		public static final String CLASS_III_CODE = "Class III";
		public static final String CLASS_III_NOTES = "The device requires registration with INVIMA, subject to pre-market review and approval. The regulatory requirements are described in the FAQs, Section Roadmap, and Technical Dossier Prep.";
	}

	public final class IVDRConfig {

		private IVDRConfig() throws IllegalAccessException {
			throw new IllegalAccessException(CANNOT_INSTANTIATE);
		}

		public static final String CLASS_A_CODE = "Class A";
		public static final String CLASS_A_NOTES = "For Class A devices (see Article 48(10)) the manufacturer shall declare conformity of their products by issuing the EU declaration of conformity referred to in Article 17, after drawing up the technical documentation set out in Annexes II and III. <BR><BR>Class A devices that are placed on the market in sterile condition shall apply the procedures set out in Annex IX or in Annex XI. Involvement of the notified body shall be limited to the aspects relating to establishing, securing, and maintaining sterile conditions. <BR><BR>";

		public static final String CLASS_B_CODE = "Class B";
		public static final String CLASS_B_NOTES = "Class B devices require Notified Body involvement (Article 48(9)). The route to conformity assessment for Class B IVDs is Chapters I and III of Annex IX (including a technical documentation assessment as specified in Section 4.4 to 4.8 of that Annex for at least one representative device for each category of devices.  <BR><BR>For Class B devices for self-testing and near-patient testing the manufacturer shall follow additionally the procedure for assessment of the technical documentation set out in Sections 5.1 of Annex IX.  <BR><BR>";

		public static final String CLASS_C_CODE = "Class C";
		public static final String CLASS_C_NOTES = "Class C devices require Notified Body involvement (Article 48(7 and 8)). The route to conformity assessment for Class C IVDs is Chapters I and III of Annex IX, including an assessment of the technical documentation as specified in Section 4 of that Annex for at least one representative device for each generic device group.  <BR><BR>For Class C devices intended for self-testing and near-patient testing the manufacturer shall follow the procedure for technical documentation assessment set out in Section 5.1 of Annex IX. <BR><BR>For Class C devices that are companion devices the Notified Body must also follow for each device the procedure for technical documentation assessment laid down in Section 5.2 of Annex IX, and shall apply the procedure for technical documentation assessment laid down in Sections 4.1 to 4.8 of Annex IX and shall consult a competent authority for medicinal products in the applicable Member State or the EMA, as applicable, in accordance with the procedure set out in point (k) of Section 3 of Annex X.  <BR>";

		public static final String CLASS_D_CODE = "Class D";
		public static final String CLASS_D_NOTES = "Class D require Notified Body involvement (Article 48(3-6). The route to conformity assessment for Class D IVDs is Chapters I, II except for Section 5, and Chapter III of Annex IX. Alternatively, they can choose to apply Annex X coupled with Annex XI. <BR><BR>For Class D devices for self-testing and near-patient testing the manufacturer shall follow additionally the procedure for assessment of the technical documentation set out in Sections 5.1 of Annex IX together with the above mentioned Annex IX route.  <BR><BR>For Class D devices that are companion diagnostics the Notified Body shall consult a competent authority for medicinal products in the applicable Member State or the EMA, as applicable, in accordance with Section 6.2 of Annex IX.  <BR><BR>If Common Specifications (CS) and reference laboratories are available the Notified Body must ask one of the reference laboratories to verify the performance claimed by the manufacturer and the compliance of the device according to Section 4.9 of Annex IX and Section 3(j) of Annex X. If no CS are available, the Notified Body may ask an opinion of the expert panel as described in Article 106 of the Medical Devices Regulation (EU) 2017/746 (MDR) .";

		public static final String CLASS_NA_CODE = "Not Applicable";
		public static final String CLASS_NA_NOTES = "This does not appear to be an IVD according to the IVDR";
	}

}