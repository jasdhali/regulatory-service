package com.example.nano.config;

/**
 * Generic class for maintaining all the URI's
 *
 * @author Krishna,Jaspal,Neel,Vineeth
 */

public final class RestEndpointConfig {

	private RestEndpointConfig() {
		// no-op
	}

	// auth

	public static final String AUTH = "/auth";
	public static final String LOGIN = "/login";

	// token

	public static final String TOKEN = "/token";
	public static final String REFRESH_TOKEN = "/refresh";

	// Tools
	public static final String TOOLS_ROOT = "/tools";
	public static final String DEVICE_ROOT = "/device";
	public static final String CALCULATE_RESULTS = "/510k/calculate/results";
	public static final String UNIQUE_VALUES_510K = "/510k/{field}/values";
	public static final String CLASSIFICATION_UNIQUE_VALUES = "/classification/{field}/values";
	public static final String CLASSFICATION_CLASS = "/classification/class";
	public static final String GLOBAL_FEE = "/global/fee";

	// SasToken
	public static final String SAS_TOKEN = "/sastoken";
	public static final int DEFAULT_TOKENDURATION = 30;
	public static final String SAS_ACCESS = "/sasaccess";
	public static final String GENRATE_TOKEN = "/genratetoken";

	// Dashboard
	public static final String UPCOMING_WIDGET = "/upcoming/widget";
	public static final String SUPPORT_FORM = "/support/form";

	// Regulations and Guidance
	public static final String REGULATIONS_GUIDANCE_ROOT = "/regulations";

	// process charts
	public static final String PROCESS_CHARTS_ROOT = "/processcharts";
	public static final String FILE_COST = "/file/path/cost";
	public static final String BY_COUNTRY = "/{country}";
	public static final String FILE = "/file/path";

	// Regulations & Guidances
	public static final String BY_ACCOUNT_ID = "/{accountId}";
	public static final String REGS_GUIDS = "/reg/guide";
	public static final String BY_USER_ID = "/{userId}";
	public static final String EU = "/eu";
	public static final String COUNTRIES = "/countries";
	public static final String BY_ID = "/{id}";
	public static final String ADD = "/add";
	public static final String RENEWAL = "/renewal";
	public static final String REQUEST = "/request";
	public static final String SEARCH_VALUE = "/{searchValue}";

	// market place
	public static final String MARKET_PLACE = "/market/place";
	public static final String MARKETPLACE = "/marketplace";
	public static final String PREMIUM_SERVICES = "/premium/services";
	public static final String SUMMARY = "/summary";
	public static final String DESCRIPTION = "/description";
	public static final String DISMISS = "/dismiss";

	// quote request
	public static final String TEMPLATES = "/templates";

	// Launch Pad
	public static final String ADMIN_LUNCHPAD = "/launchpad";
	public static final String SERVICE = "/service";
	public static final String ACTIVATE = "/activate";
	public static final String REMOVE = "/remove";
	public static final String ACTIVITY_TRACKER = "/activity/tracker";
	public static final String COUNT = "/count";
	public static final String DEACTIVATE = "/deactivate";
	public static final String PREFERENCES = "/preferences";
	public static final String DATA = "/data";
	public static final String USER = "/user";
	public static final String PASSWORD = "/password";
	public static final String EXPORT = "/export";
	public static final String EXPIRY = "/expiry";
	public static final String ACCOUNT_NAME = "/{accountName}";
	public static final String PLANS = "/plans";
	public static final String PREFERENCE = "/preference";
	public static final String STATUS = "/status";

	// Reg Faq
	public static final String REG_FAQ = "/resources/regfaqs";
	public static final String UPDATE_FAQ = "/updpart";
	public static final String PREVIEW_FLAG = "/{previewFlag}";

	// regulatory essential reports
	public static final String REGULATORY_PATHWAY = "/regpathway";
	public static final String REGULATORY_ESSENTIAL_REPORT = "/regessentialreport";
	public static final String REGULATORY_ESSENTIAL_PURCHASE = "/purchase";
	public static final String ESSENTIAL = "/essentials";

	// regulatory intelligence
	public static final String REGULATORY_INTEL = "/regintel";
	public static final String META_DATA = "/metadata";
	public static final String CONTENT_UPLOAD = "/content/upload";
	public static final String REGULATORY = "/regulatory";
	public static final String INTELLIGENCE = "/intelligence";
	public static final String COMPLIMENTARY = "/complimentary";
	public static final String COUNTRY = "/country";
	public static final String ALL = "/all";
	public static final String BY_ADDON_ID = "/{addonId}";

	// Dashboard Headlines & Featured Content
	public static final String HEADLINES = "/headlines";
	public static final String HEADLINE_ID = "/{id}";
	public static final String UPDATED_BY_ID = "/{updatedBy}";
	public static final String HEADLINE_TYPE = "/{type}";
	public static final String FEATURED_CONTENT = "/featured/content";

	// Representation Resources
	public static final String REPRESENTATION_RESOURCES = "/representation/resources";
	public static final String REP_RES_MISC = "/rep/res/misc";
	public static final String ADD_COUNTRIES = "/add/countries";
	public static final String CATEGORY = "/category";

	// banner
	public static final String BANNER = "/banner";
	public static final String BY_BANNER_ID = "/{bannerId}";

	// open
	public static final String OPEN = "/open";
	public static final String ACTIVE = "/active";
	public static final String TYPES = "/types";

	// plan
	public static final String PLAN = "/plan";
	public static final String PRICE = "/price";
	public static final String MAPPING = "/mapping";

	// billing info
	public static final String BILLING_INFO = "/billing/info";

	// add-on
	public static final String ADDON = "/addon";
	public static final String ACCOUNT = "/account";
	public static final String ACCOUNTS = "/accounts";
	public static final String EMAIL = "/email";
	public static final String USERID = "/userId";
	public static final String UTILIZATION = "/utilization";
	public static final String CAPACITY = "/capacity";
	public static final String UPDATE = "/update";
	public static final String HISTORY = "/history";
	public static final String CONTACT = "/contact";
	public static final String DETAILS = "/details";

	// payment
	public static final String PAYMENT = "/payment";
	public static final String INIT = "/init";
	public static final String MODES = "/modes";
	public static final String MODE = "/mode";
	public static final String OPERATION_NAMES = "/operation/names";

	// admin
	public static final String ADMIN = "/admin";
	public static final String INFO = "/info";

	// product classification
	public static final String PROD_CLASSIFICATION = "/prodclass";
	public static final String CLASSIFICATION_ATTR = "/classificationByAttributes";
	public static final String CLASSIFICATION_ATTR_LEVEL = "/classificationByAttributesWrapper";
	public static final String CLASSIFICATION_WORKFLOW_AUDIT = "/productClassWorkflowAudit";
	public static final String EMAIL_WORKFLOW = "/rationaleEmailWorkflow";
	public static final String RATIONALE_REP_QUESTIONS = "/rationaleReportQuestions";
	public static final String UPGRADE_RATIONALE_REPORT = "/upgradeRationaleReport";
	public static final String IVDR = "/IVDR";
	public static final String BY_CLASS_HEADERID = "/{classHeaderId}";
	public static final String HEADER = "/headerId";
	public static final String KIT = "/KIT";
	public static final String RATIONALE_HEADER = "/rationaleHeader";

	public static final String CREATE_MED_BULK_RULES = "/createMedBulkRules";
	public static final String CREATE_IVDR_BULK_RULES = "/createIVDRBulkRules";
	public static final String CLASS_RATIONALE_RULES = "/classificationRationaleBulkRules";

	// class rationale
	public static final String RULES = "/rules";
	public static final String CREATE_RATIONALE_INSTANCE = "/createrRationaleReportInstance";
	public static final String CLASS_RATIONALE_REQUEST = "/classificationRationaleRequest";
	public static final String RATIONALE_REP_DNLD = "/rationaleReportDownload";

	// dashboard customization
	public static final String DASHBOARD_CUSTOMIZATION = "/dashboard/customization";
	public static final String NOTIFICATION = "/notification";
	public static final String REMAINING = "/remaining";
	public static final String AVAILABLE = "/available";
	public static final String DEFAULT = "/default";
	public static final String WIDGET = "/widget";
	public static final String PANEL = "/panel";
	public static final String CARD = "/card";
	public static final String TYPE = "/type";

	// Role based access permission
	public static final String RBAC = "/rbac";
	public static final String PERMISSIONS = "/permissions";
	public static final String TEMPLATE = "/template";
	public static final String ACCOUNT_LAST_USED = "/accountLastUsed";
	public static final String BY_ROLE_ID = "/{roleId}";
	public static final String BY_SERVICE_ID = "/{serviceId}";
	public static final String BY_EMAIL_ID = "/{email}";
	public static final String SWITCH_ACCOUNTS = "/switchAccount";
	public static final String LAST_ROLE_ID = "/lastRoleId";
	public static final String ACCT_TYPE = "/accountType";

	// Get list of Roles and its permission
	public static final String ROLE_LIST = "/roleList";
	public static final String ROLE_INFO = "/roleInfo";
	public static final String SERVICE_RBAC = "/servicerbac";

	// resource dashboard
	public static final String DASHBOARD = "/dashboard";
	public static final String RESOURCE = "/resource";
	public static final String RESOURCES = "/resources";

	// regulatory intelligence archive
	public static final String ARCHIVE = "/archive";

	// ecm
	public static final String ECM = "/ecm";

	// mydocs
	public static final String MYDOCS = "/mydocs";
	public static final String CATEGORIES = "/categories";
	public static final String SUBCATEGORIES = "/subcategories";
	public static final String TABS = "/tabs";
	public static final String FOLDER = "/folder";
	public static final String SEARCH = "/search";
	public static final String IS = "/is";
	public static final String NAME = "/name";
	public static final String EXISTS = "/exists";
	public static final String FILTER = "/filter";
	public static final String DOCUMENT = "/document";
	public static final String VERSION = "/version";
	public static final String BY_DOCUMENT_ID = "/{documentId}";
	public static final String DOWNLOAD = "/download";

	// Account Type Conversion
	public static final String TO = "/to";
	public static final String REP = "/rep";
	public static final String COMMERCIAL = "/commercial";

	// compliance wire
	public static final String COMPLIANCE_WIRE = "/compliance/wire";

	// market insights
	public static final String MARKET_INSIGHTS = "/market/insights";
	public static final String CONTENT = "/content";
	public static final String ACTIVITY = "/activity";
	public static final String ADD_CONTENTS = "/addcontents";
	public static final String UPDATE_CONTENTS = "/updatecontents";
	public static final String DELETE_CONTENTS = "/delete/contents";

	// profile
	public static final String SELF = "/self";

	// chase payment
	public static final String FORM_TYPE_ID = "/{formTypeId}";
	// public static final String UID = "/{uId}";

	// Marketo
	public static final String MARKETO = "/marketo";
	public static final String ACCESS = "/access";
	public static final String SUBMIT = "/submit";
	public static final String FORM = "/form";

	// pro rata calculation -249113
	public static final String PRORATA = "/prorata";

	// Agreements Page 239399
	public static final String AGREEMENTS = "/agreements";
	public static final String ARCHIVED = "/archived";
	public static final String BY_ARCHIV = "/{archive}";

	// Product Tracker (Representation Resources)
	public static final String PRODUCT_TRACKER = "/producttracker";
	public static final String PRODUCT_TRACKER_TRADE = "/trade";
	public static final String PRODUCT_TRACKER_CONTACT = "/contact";
	public static final String PRODUCT_TRACKER_MARKET = "/market";
	public static final String PRODUCT_TRACKER_WKFLOWSTATUS = "/workflowstatus";
	public static final String BY_WKFLOWSTATUS_ID = "/{workflowStatusId}";
	public static final String BY_COUNTRYID = "/{countryId}";
	public static final String PRODUCT_TRACKER_CLASSES = "/classes";
	public static final String PRODUCT_TRACKER_METADATA = "/metadata";
	public static final String PRODUCT_TRACKER_ID = "/{prodTrckrId}";
	public static final String PRODUCT_TRACKER_MARKET_ID = "/{marketId}";
	public static final String PRODUCT_TRACKER_REMOVAL = "/remove";
	public static final String PRODUCT_TRACKER_UPDATE = "/update";
	public static final String PRODUCT_TRACKER_DELEGATE = "/delegate";

}