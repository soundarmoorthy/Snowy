package in.soundararajan;

import com.opencsv.bean.CsvBindByPosition;
/**
*Created_by_dakshins_on_24/02/18.
*/
public class ProviderBean implements IProviderBean
{
    public ProviderBean()
    {

    }

@CsvBindByPosition(position = 0 )
public String NPI;

@CsvBindByPosition(position = 1 )
public String Entity_Type_Code;

@CsvBindByPosition(position = 2 )
public String Replacement_NPI;

@CsvBindByPosition(position = 3 )
public String Employer_Identification_Number_EIN;

@CsvBindByPosition(position = 4 )
public String Org_Name_Legal_Business_Name;

@CsvBindByPosition(position = 5 )
public String Last_Name_Legal_Name;

@CsvBindByPosition(position = 6 )
public String First_Name;

@CsvBindByPosition(position = 7 )
public String Middle_Name;

@CsvBindByPosition(position = 8 )
public String Name_Prefix_Text;

@CsvBindByPosition(position = 9 )
public String Name_Suffix_Text;

@CsvBindByPosition(position = 10 )
public String Credential_Text;

@CsvBindByPosition(position = 11 )
public String Other_Org_Name;

@CsvBindByPosition(position = 12 )
public String Other_Org_Name_Type_Code;

@CsvBindByPosition(position = 13 )
public String Other_Last_Name;

@CsvBindByPosition(position = 14 )
public String Other_First_Name;

@CsvBindByPosition(position = 15 )
public String Other_Middle_Name;

@CsvBindByPosition(position = 16 )
public String Other_Name_Prefix_Text;

@CsvBindByPosition(position = 17 )
public String Other_Name_Suffix_Text;

@CsvBindByPosition(position = 18 )
public String Other_Credential_Text;

@CsvBindByPosition(position = 19 )
public String Other_Last_Name_Type_Code;

@CsvBindByPosition(position = 20 )
public String First_Line_BizAdd;

@CsvBindByPosition(position = 21 )
public String Second_Line_BizAdd;

@CsvBindByPosition(position = 22 )
public String BizAdd_City_Name;

@CsvBindByPosition(position = 23 )
public String BizAdd_State_Name;

@CsvBindByPosition(position = 24 )
public String BizAdd_Postal_Code;

@CsvBindByPosition(position = 25 )
public String BizAdd_Country_Code_If_outside_US;

@CsvBindByPosition(position = 26 )
public String BizAdd_Telephone_Number;

@CsvBindByPosition(position = 27 )
public String BizAdd_Fax_Number;

@CsvBindByPosition(position = 28 )
public String First_Line_BizLocAdd;

@CsvBindByPosition(position = 29 )
public String Second_Line_BizLocAdd;

@CsvBindByPosition(position = 30 )
public String BizLocAdd_City_Name;

@CsvBindByPosition(position = 31 )
public String BizLocAdd_State_Name;

@CsvBindByPosition(position = 32 )
public String BizLocAdd_Postal_Code;

@CsvBindByPosition(position = 33 )
public String BizLocAdd_Country_Code_If_outside_US;

@CsvBindByPosition(position = 34 )
public String BizLocAdd_Telephone_Number;

@CsvBindByPosition(position = 35 )
public String BizLocAdd_Fax_Number;

@CsvBindByPosition(position = 36 )
public String Enumeration_Date;

@CsvBindByPosition(position = 37 )
public String Last_Update_Date;

@CsvBindByPosition(position = 38 )
public String NPI_Deactivation_Reason_Code;

@CsvBindByPosition(position = 39 )
public String NPI_Deactivation_Date;

@CsvBindByPosition(position = 40 )
public String NPI_Reactivation_Date;

@CsvBindByPosition(position = 41 )
public String Gender_Code;

@CsvBindByPosition(position = 42 )
public String AuthOff_Last_Name;

@CsvBindByPosition(position = 43 )
public String AuthOff_First_Name;

@CsvBindByPosition(position = 44 )
public String AuthOff_Middle_Name;

@CsvBindByPosition(position = 45 )
public String AuthOff_Title_or_Position;

@CsvBindByPosition(position = 46 )
public String AuthOff_Telephone_Number;

@CsvBindByPosition(position = 47 )
public String bb_1;

@CsvBindByPosition(position = 48 )
public String dd_1;

@CsvBindByPosition(position = 49 )
public String aa_1;

@CsvBindByPosition(position = 50 )
public String HCPTS_1;

@CsvBindByPosition(position = 51 )
public String bb_2;

@CsvBindByPosition(position = 52 )
public String dd_2;

@CsvBindByPosition(position = 53 )
public String aa_2;

@CsvBindByPosition(position = 54 )
public String HCPTS_2;

@CsvBindByPosition(position = 55 )
public String bb_3;

@CsvBindByPosition(position = 56 )
public String dd_3;

@CsvBindByPosition(position = 57 )
public String aa_3;

@CsvBindByPosition(position = 58 )
public String HCPTS_3;

@CsvBindByPosition(position = 59 )
public String bb_4;

@CsvBindByPosition(position = 60 )
public String dd_4;

@CsvBindByPosition(position = 61 )
public String aa_4;

@CsvBindByPosition(position = 62 )
public String HCPTS_4;

@CsvBindByPosition(position = 63 )
public String bb_5;

@CsvBindByPosition(position = 64 )
public String dd_5;

@CsvBindByPosition(position = 65 )
public String aa_5;

@CsvBindByPosition(position = 66 )
public String HCPTS_5;

@CsvBindByPosition(position = 67 )
public String bb_6;

@CsvBindByPosition(position = 68 )
public String dd_6;

@CsvBindByPosition(position = 69 )
public String aa_6;

@CsvBindByPosition(position = 70 )
public String HCPTS_6;

@CsvBindByPosition(position = 71 )
public String bb_7;

@CsvBindByPosition(position = 72 )
public String dd_7;

@CsvBindByPosition(position = 73 )
public String aa_7;

@CsvBindByPosition(position = 74 )
public String HCPTS_7;

@CsvBindByPosition(position = 75 )
public String bb_8;

@CsvBindByPosition(position = 76 )
public String dd_8;

@CsvBindByPosition(position = 77 )
public String aa_8;

@CsvBindByPosition(position = 78 )
public String HCPTS_8;

@CsvBindByPosition(position = 79 )
public String bb_9;

@CsvBindByPosition(position = 80 )
public String dd_9;

@CsvBindByPosition(position = 81 )
public String aa_9;

@CsvBindByPosition(position = 82 )
public String HCPTS_9;

@CsvBindByPosition(position = 83 )
public String bb_10;

@CsvBindByPosition(position = 84 )
public String dd_10;

@CsvBindByPosition(position = 85 )
public String aa_10;

@CsvBindByPosition(position = 86 )
public String HCPTS_10;

@CsvBindByPosition(position = 87 )
public String bb_11;

@CsvBindByPosition(position = 88 )
public String dd_11;

@CsvBindByPosition(position = 89 )
public String aa_11;

@CsvBindByPosition(position = 90 )
public String HCPTS_11;

@CsvBindByPosition(position = 91 )
public String bb_12;

@CsvBindByPosition(position = 92 )
public String dd_12;

@CsvBindByPosition(position = 93 )
public String aa_12;

@CsvBindByPosition(position = 94 )
public String HCPTS_12;

@CsvBindByPosition(position = 95 )
public String bb_13;

@CsvBindByPosition(position = 96 )
public String dd_13;

@CsvBindByPosition(position = 97 )
public String aa_13;

@CsvBindByPosition(position = 98 )
public String HCPTS_13;

@CsvBindByPosition(position = 99 )
public String bb_14;

@CsvBindByPosition(position = 100 )
public String dd_14;

@CsvBindByPosition(position = 101 )
public String aa_14;

@CsvBindByPosition(position = 102 )
public String HCPTS_14;

@CsvBindByPosition(position = 103 )
public String bb_15;

@CsvBindByPosition(position = 104 )
public String dd_15;

@CsvBindByPosition(position = 105 )
public String aa_15;

@CsvBindByPosition(position = 106 )
public String HCPTS_15;

@CsvBindByPosition(position = 107 )
public String OI_1;

@CsvBindByPosition(position = 108 )
public String OITC_1;

@CsvBindByPosition(position = 109 )
public String OIS_1;

@CsvBindByPosition(position = 110 )
public String OII_1;

@CsvBindByPosition(position = 111 )
public String OI_2;

@CsvBindByPosition(position = 112 )
public String OITC_2;

@CsvBindByPosition(position = 113 )
public String OIS_2;

@CsvBindByPosition(position = 114 )
public String OII_2;

@CsvBindByPosition(position = 115 )
public String OI_3;

@CsvBindByPosition(position = 116 )
public String OITC_3;

@CsvBindByPosition(position = 117 )
public String OIS_3;

@CsvBindByPosition(position = 118 )
public String OII_3;

@CsvBindByPosition(position = 119 )
public String OI_4;

@CsvBindByPosition(position = 120 )
public String OITC_4;

@CsvBindByPosition(position = 121 )
public String OIS_4;

@CsvBindByPosition(position = 122 )
public String OII_4;

@CsvBindByPosition(position = 123 )
public String OI_5;

@CsvBindByPosition(position = 124 )
public String OITC_5;

@CsvBindByPosition(position = 125 )
public String OIS_5;

@CsvBindByPosition(position = 126 )
public String OII_5;

@CsvBindByPosition(position = 127 )
public String OI_6;

@CsvBindByPosition(position = 128 )
public String OITC_6;

@CsvBindByPosition(position = 129 )
public String OIS_6;

@CsvBindByPosition(position = 130 )
public String OII_6;

@CsvBindByPosition(position = 131 )
public String OI_7;

@CsvBindByPosition(position = 132 )
public String OITC_7;

@CsvBindByPosition(position = 133 )
public String OIS_7;

@CsvBindByPosition(position = 134 )
public String OII_7;

@CsvBindByPosition(position = 135 )
public String OI_8;

@CsvBindByPosition(position = 136 )
public String OITC_8;

@CsvBindByPosition(position = 137 )
public String OIS_8;

@CsvBindByPosition(position = 138 )
public String OII_8;

@CsvBindByPosition(position = 139 )
public String OI_9;

@CsvBindByPosition(position = 140 )
public String OITC_9;

@CsvBindByPosition(position = 141 )
public String OIS_9;

@CsvBindByPosition(position = 142 )
public String OII_9;

@CsvBindByPosition(position = 143 )
public String OI_10;

@CsvBindByPosition(position = 144 )
public String OITC_10;

@CsvBindByPosition(position = 145 )
public String OIS_10;

@CsvBindByPosition(position = 146 )
public String OII_10;

@CsvBindByPosition(position = 147 )
public String OI_11;

@CsvBindByPosition(position = 148 )
public String OITC_11;

@CsvBindByPosition(position = 149 )
public String OIS_11;

@CsvBindByPosition(position = 150 )
public String OII_11;

@CsvBindByPosition(position = 151 )
public String OI_12;

@CsvBindByPosition(position = 152 )
public String OITC_12;

@CsvBindByPosition(position = 153 )
public String OIS_12;

@CsvBindByPosition(position = 154 )
public String OII_12;

@CsvBindByPosition(position = 155 )
public String OI_13;

@CsvBindByPosition(position = 156 )
public String OITC_13;

@CsvBindByPosition(position = 157 )
public String OIS_13;

@CsvBindByPosition(position = 158 )
public String OII_13;

@CsvBindByPosition(position = 159 )
public String OI_14;

@CsvBindByPosition(position = 160 )
public String OITC_14;

@CsvBindByPosition(position = 161 )
public String OIS_14;

@CsvBindByPosition(position = 162 )
public String OII_14;

@CsvBindByPosition(position = 163 )
public String OI_15;

@CsvBindByPosition(position = 164 )
public String OITC_15;

@CsvBindByPosition(position = 165 )
public String OIS_15;

@CsvBindByPosition(position = 166 )
public String OII_15;

@CsvBindByPosition(position = 167 )
public String OI_16;

@CsvBindByPosition(position = 168 )
public String OITC_16;

@CsvBindByPosition(position = 169 )
public String OIS_16;

@CsvBindByPosition(position = 170 )
public String OII_16;

@CsvBindByPosition(position = 171 )
public String OI_17;

@CsvBindByPosition(position = 172 )
public String OITC_17;

@CsvBindByPosition(position = 173 )
public String OIS_17;

@CsvBindByPosition(position = 174 )
public String OII_17;

@CsvBindByPosition(position = 175 )
public String OI_18;

@CsvBindByPosition(position = 176 )
public String OITC_18;

@CsvBindByPosition(position = 177 )
public String OIS_18;

@CsvBindByPosition(position = 178 )
public String OII_18;

@CsvBindByPosition(position = 179 )
public String OI_19;

@CsvBindByPosition(position = 180 )
public String OITC_19;

@CsvBindByPosition(position = 181 )
public String OIS_19;

@CsvBindByPosition(position = 182 )
public String OII_19;

@CsvBindByPosition(position = 183 )
public String OI_20;

@CsvBindByPosition(position = 184 )
public String OITC_20;

@CsvBindByPosition(position = 185 )
public String OIS_20;

@CsvBindByPosition(position = 186 )
public String OII_20;

@CsvBindByPosition(position = 187 )
public String OI_21;

@CsvBindByPosition(position = 188 )
public String OITC_21;

@CsvBindByPosition(position = 189 )
public String OIS_21;

@CsvBindByPosition(position = 190 )
public String OII_21;

@CsvBindByPosition(position = 191 )
public String OI_22;

@CsvBindByPosition(position = 192 )
public String OITC_22;

@CsvBindByPosition(position = 193 )
public String OIS_22;

@CsvBindByPosition(position = 194 )
public String OII_22;

@CsvBindByPosition(position = 195 )
public String OI_23;

@CsvBindByPosition(position = 196 )
public String OITC_23;

@CsvBindByPosition(position = 197 )
public String OIS_23;

@CsvBindByPosition(position = 198 )
public String OII_23;

@CsvBindByPosition(position = 199 )
public String OI_24;

@CsvBindByPosition(position = 200 )
public String OITC_24;

@CsvBindByPosition(position = 201 )
public String OIS_24;

@CsvBindByPosition(position = 202 )
public String OII_24;

@CsvBindByPosition(position = 203 )
public String OI_25;

@CsvBindByPosition(position = 204 )
public String OITC_25;

@CsvBindByPosition(position = 205 )
public String OIS_25;

@CsvBindByPosition(position = 206 )
public String OII_25;

@CsvBindByPosition(position = 207 )
public String OI_26;

@CsvBindByPosition(position = 208 )
public String OITC_26;

@CsvBindByPosition(position = 209 )
public String OIS_26;

@CsvBindByPosition(position = 210 )
public String OII_26;

@CsvBindByPosition(position = 211 )
public String OI_27;

@CsvBindByPosition(position = 212 )
public String OITC_27;

@CsvBindByPosition(position = 213 )
public String OIS_27;

@CsvBindByPosition(position = 214 )
public String OII_27;

@CsvBindByPosition(position = 215 )
public String OI_28;

@CsvBindByPosition(position = 216 )
public String OITC_28;

@CsvBindByPosition(position = 217 )
public String OIS_28;

@CsvBindByPosition(position = 218 )
public String OII_28;

@CsvBindByPosition(position = 219 )
public String OI_29;

@CsvBindByPosition(position = 220 )
public String OITC_29;

@CsvBindByPosition(position = 221 )
public String OIS_29;

@CsvBindByPosition(position = 222 )
public String OII_29;

@CsvBindByPosition(position = 223 )
public String OI_30;

@CsvBindByPosition(position = 224 )
public String OITC_30;

@CsvBindByPosition(position = 225 )
public String OIS_30;

@CsvBindByPosition(position = 226 )
public String OII_30;

@CsvBindByPosition(position = 227 )
public String OI_31;

@CsvBindByPosition(position = 228 )
public String OITC_31;

@CsvBindByPosition(position = 229 )
public String OIS_31;

@CsvBindByPosition(position = 230 )
public String OII_31;

@CsvBindByPosition(position = 231 )
public String OI_32;

@CsvBindByPosition(position = 232 )
public String OITC_32;

@CsvBindByPosition(position = 233 )
public String OIS_32;

@CsvBindByPosition(position = 234 )
public String OII_32;

@CsvBindByPosition(position = 235 )
public String OI_33;

@CsvBindByPosition(position = 236 )
public String OITC_33;

@CsvBindByPosition(position = 237 )
public String OIS_33;

@CsvBindByPosition(position = 238 )
public String OII_33;

@CsvBindByPosition(position = 239 )
public String OI_34;

@CsvBindByPosition(position = 240 )
public String OITC_34;

@CsvBindByPosition(position = 241 )
public String OIS_34;

@CsvBindByPosition(position = 242 )
public String OII_34;

@CsvBindByPosition(position = 243 )
public String OI_35;

@CsvBindByPosition(position = 244 )
public String OITC_35;

@CsvBindByPosition(position = 245 )
public String OIS_35;

@CsvBindByPosition(position = 246 )
public String OII_35;

@CsvBindByPosition(position = 247 )
public String OI_36;

@CsvBindByPosition(position = 248 )
public String OITC_36;

@CsvBindByPosition(position = 249 )
public String OIS_36;

@CsvBindByPosition(position = 250 )
public String OII_36;

@CsvBindByPosition(position = 251 )
public String OI_37;

@CsvBindByPosition(position = 252 )
public String OITC_37;

@CsvBindByPosition(position = 253 )
public String OIS_37;

@CsvBindByPosition(position = 254 )
public String OII_37;

@CsvBindByPosition(position = 255 )
public String OI_38;

@CsvBindByPosition(position = 256 )
public String OITC_38;

@CsvBindByPosition(position = 257 )
public String OIS_38;

@CsvBindByPosition(position = 258 )
public String OII_38;

@CsvBindByPosition(position = 259 )
public String OI_39;

@CsvBindByPosition(position = 260 )
public String OITC_39;

@CsvBindByPosition(position = 261 )
public String OIS_39;

@CsvBindByPosition(position = 262 )
public String OII_39;

@CsvBindByPosition(position = 263 )
public String OI_40;

@CsvBindByPosition(position = 264 )
public String OITC_40;

@CsvBindByPosition(position = 265 )
public String OIS_40;

@CsvBindByPosition(position = 266 )
public String OII_40;

@CsvBindByPosition(position = 267 )
public String OI_41;

@CsvBindByPosition(position = 268 )
public String OITC_41;

@CsvBindByPosition(position = 269 )
public String OIS_41;

@CsvBindByPosition(position = 270 )
public String OII_41;

@CsvBindByPosition(position = 271 )
public String OI_42;

@CsvBindByPosition(position = 272 )
public String OITC_42;

@CsvBindByPosition(position = 273 )
public String OIS_42;

@CsvBindByPosition(position = 274 )
public String OII_42;

@CsvBindByPosition(position = 275 )
public String OI_43;

@CsvBindByPosition(position = 276 )
public String OITC_43;

@CsvBindByPosition(position = 277 )
public String OIS_43;

@CsvBindByPosition(position = 278 )
public String OII_43;

@CsvBindByPosition(position = 279 )
public String OI_44;

@CsvBindByPosition(position = 280 )
public String OITC_44;

@CsvBindByPosition(position = 281 )
public String OIS_44;

@CsvBindByPosition(position = 282 )
public String OII_44;

@CsvBindByPosition(position = 283 )
public String OI_45;

@CsvBindByPosition(position = 284 )
public String OITC_45;

@CsvBindByPosition(position = 285 )
public String OIS_45;

@CsvBindByPosition(position = 286 )
public String OII_45;

@CsvBindByPosition(position = 287 )
public String OI_46;

@CsvBindByPosition(position = 288 )
public String OITC_46;

@CsvBindByPosition(position = 289 )
public String OIS_46;

@CsvBindByPosition(position = 290 )
public String OII_46;

@CsvBindByPosition(position = 291 )
public String OI_47;

@CsvBindByPosition(position = 292 )
public String OITC_47;

@CsvBindByPosition(position = 293 )
public String OIS_47;

@CsvBindByPosition(position = 294 )
public String OII_47;

@CsvBindByPosition(position = 295 )
public String OI_48;

@CsvBindByPosition(position = 296 )
public String OITC_48;

@CsvBindByPosition(position = 297 )
public String OIS_48;

@CsvBindByPosition(position = 298 )
public String OII_48;

@CsvBindByPosition(position = 299 )
public String OI_49;

@CsvBindByPosition(position = 300 )
public String OITC_49;

@CsvBindByPosition(position = 301 )
public String OIS_49;

@CsvBindByPosition(position = 302 )
public String OII_49;

@CsvBindByPosition(position = 303 )
public String OI_50;

@CsvBindByPosition(position = 304 )
public String OITC_50;

@CsvBindByPosition(position = 305 )
public String OIS_50;

@CsvBindByPosition(position = 306 )
public String OII_50;

@CsvBindByPosition(position = 307 )
public String Is_Sole_Proprietor;

@CsvBindByPosition(position = 308 )
public String Is_Org_Subpart;

@CsvBindByPosition(position = 309 )
public String Parent_Org_LBN;

@CsvBindByPosition(position = 310 )
public String Parent_Org_TIN;

@CsvBindByPosition(position = 311 )
public String AuthOff_Name_Prefix_Text;

@CsvBindByPosition(position = 312 )
public String AuthOff_Name_Suffix_Text;

@CsvBindByPosition(position = 313 )
public String AuthOff_Credential_Text;

@CsvBindByPosition(position = 314 )
public String hh_1;

@CsvBindByPosition(position = 315 )
public String hh_2;

@CsvBindByPosition(position = 316 )
public String hh_3;

@CsvBindByPosition(position = 317 )
public String hh_4;

@CsvBindByPosition(position = 318 )
public String hh_5;

@CsvBindByPosition(position = 319 )
public String hh_6;

@CsvBindByPosition(position = 320 )
public String hh_7;

@CsvBindByPosition(position = 321 )
public String hh_8;

@CsvBindByPosition(position = 322 )
public String hh_9;

@CsvBindByPosition(position = 323 )
public String hh_10;

@CsvBindByPosition(position = 324 )
public String hh_11;

@CsvBindByPosition(position = 325 )
public String hh_12;

@CsvBindByPosition(position = 326 )
public String hh_13;

@CsvBindByPosition(position = 327 )
public String hh_14;

@CsvBindByPosition(position = 328 )
public String hh_15;

    //hh => Healthcare PT Group

    public String getNPI() {
        return NPI;
    }

    public void setNPI(String NPI) {
        this.NPI = NPI;
    }

    public String getEntity_Type_Code() {
        return Entity_Type_Code;
    }

    public void setEntity_Type_Code(String entity_Type_Code) {
        Entity_Type_Code = entity_Type_Code;
    }

    public String getReplacement_NPI() {
        return Replacement_NPI;
    }

    public void setReplacement_NPI(String replacement_NPI) {
        Replacement_NPI = replacement_NPI;
    }

    public String getEmployer_Identification_Number_EIN() {
        return Employer_Identification_Number_EIN;
    }

    public void setEmployer_Identification_Number_EIN(String employer_Identification_Number_EIN) {
        Employer_Identification_Number_EIN = employer_Identification_Number_EIN;
    }

    public String getOrg_Name_Legal_Business_Name() {
        return Org_Name_Legal_Business_Name;
    }

    public void setOrg_Name_Legal_Business_Name(String provider_Org_Name_Legal_Business_Name) {
        Org_Name_Legal_Business_Name = provider_Org_Name_Legal_Business_Name;
    }

    public String getLast_Name_Legal_Name() {
        return Last_Name_Legal_Name;
    }

    public void setLast_Name_Legal_Name(String provider_Last_Name_Legal_Name) {
        Last_Name_Legal_Name = provider_Last_Name_Legal_Name;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String provider_First_Name) {
        First_Name = provider_First_Name;
    }

    public String getMiddle_Name() {
        return Middle_Name;
    }

    public void setMiddle_Name(String provider_Middle_Name) {
        Middle_Name = provider_Middle_Name;
    }

    public String getName_Prefix_Text() {
        return Name_Prefix_Text;
    }

    public void setName_Prefix_Text(String provider_Name_Prefix_Text) {
        Name_Prefix_Text = provider_Name_Prefix_Text;
    }

    public String getName_Suffix_Text() {
        return Name_Suffix_Text;
    }

    public void setName_Suffix_Text(String provider_Name_Suffix_Text) {
        Name_Suffix_Text = provider_Name_Suffix_Text;
    }

    public String getCredential_Text() {
        return Credential_Text;
    }

    public void setCredential_Text(String provider_Credential_Text) {
        Credential_Text = provider_Credential_Text;
    }

    public String getOther_Org_Name() {
        return Other_Org_Name;
    }

    public void setOther_Org_Name(String provider_Other_Org_Name) {
        Other_Org_Name = provider_Other_Org_Name;
    }

    public String getOther_Org_Name_Type_Code() {
        return Other_Org_Name_Type_Code;
    }

    public void setOther_Org_Name_Type_Code(String provider_Other_Org_Name_Type_Code) {
        Other_Org_Name_Type_Code = provider_Other_Org_Name_Type_Code;
    }

    public String getOther_Last_Name() {
        return Other_Last_Name;
    }

    public void setOther_Last_Name(String provider_Other_Last_Name) {
        Other_Last_Name = provider_Other_Last_Name;
    }

    public String getOther_First_Name() {
        return Other_First_Name;
    }

    public void setOther_First_Name(String provider_Other_First_Name) {
        Other_First_Name = provider_Other_First_Name;
    }

    public String getOther_Middle_Name() {
        return Other_Middle_Name;
    }

    public void setOther_Middle_Name(String provider_Other_Middle_Name) {
        Other_Middle_Name = provider_Other_Middle_Name;
    }

    public String getOther_Name_Prefix_Text() {
        return Other_Name_Prefix_Text;
    }

    public void setOther_Name_Prefix_Text(String provider_Other_Name_Prefix_Text) {
        Other_Name_Prefix_Text = provider_Other_Name_Prefix_Text;
    }

    public String getOther_Name_Suffix_Text() {
        return Other_Name_Suffix_Text;
    }

    public void setOther_Name_Suffix_Text(String provider_Other_Name_Suffix_Text) {
        Other_Name_Suffix_Text = provider_Other_Name_Suffix_Text;
    }

    public String getOther_Credential_Text() {
        return Other_Credential_Text;
    }

    public void setOther_Credential_Text(String provider_Other_Credential_Text) {
        Other_Credential_Text = provider_Other_Credential_Text;
    }

    public String getOther_Last_Name_Type_Code() {
        return Other_Last_Name_Type_Code;
    }

    public void setOther_Last_Name_Type_Code(String provider_Other_Last_Name_Type_Code) {
        Other_Last_Name_Type_Code = provider_Other_Last_Name_Type_Code;
    }

    public String getFirst_Line_BizAdd() {
        return First_Line_BizAdd;
    }

    public void setFirst_Line_BizAdd(String provider_First_Line_Biz_Address) {
        First_Line_BizAdd = provider_First_Line_Biz_Address;
    }

    public String getSecond_Line_BizAdd() {
        return Second_Line_BizAdd;
    }

    public void setSecond_Line_BizAdd(String provider_Second_Line_Biz_Address) {
        Second_Line_BizAdd = provider_Second_Line_Biz_Address;
    }

    public String getBizAdd_City_Name() {
        return BizAdd_City_Name;
    }

    public void setBizAdd_City_Name(String provider_Biz_Address_City_Name) {
        BizAdd_City_Name = provider_Biz_Address_City_Name;
    }

    public String getBizAdd_State_Name() {
        return BizAdd_State_Name;
    }

    public void setBizAdd_State_Name(String provider_Biz_Address_State_Name) {
        BizAdd_State_Name = provider_Biz_Address_State_Name;
    }

    public String getBizAdd_Postal_Code() {
        return BizAdd_Postal_Code;
    }

    public void setBizAdd_Postal_Code(String provider_Biz_Address_Postal_Code) {
        BizAdd_Postal_Code = provider_Biz_Address_Postal_Code;
    }

    public String getBizAdd_Country_Code_If_outside_US() {
        return BizAdd_Country_Code_If_outside_US;
    }

    public void setBizAdd_Country_Code_If_outside_US(String provider_Biz_Address_Country_Code_If_outside_US) {
        BizAdd_Country_Code_If_outside_US = provider_Biz_Address_Country_Code_If_outside_US;
    }

    public String getBizAdd_Telephone_Number() {
        return BizAdd_Telephone_Number;
    }

    public void setBizAdd_Telephone_Number(String provider_Biz_Address_Telephone_Number) {
        BizAdd_Telephone_Number = provider_Biz_Address_Telephone_Number;
    }

    public String getBizAdd_Fax_Number() {
        return BizAdd_Fax_Number;
    }

    public void setBizAdd_Fax_Number(String provider_Biz_Address_Fax_Number) {
        BizAdd_Fax_Number = provider_Biz_Address_Fax_Number;
    }

    public String getFirst_Line_BizLocAdd() {
        return First_Line_BizLocAdd;
    }

    public void setFirst_Line_BizLocAdd(String provider_First_Line_BizLocAdd) {
        First_Line_BizLocAdd = provider_First_Line_BizLocAdd;
    }

    public String getSecond_Line_BizLocAdd() {
        return Second_Line_BizLocAdd;
    }

    public void setSecond_Line_BizLocAdd(String provider_Second_Line_BizLocAdd) {
        Second_Line_BizLocAdd = provider_Second_Line_BizLocAdd;
    }

    public String getBizLocAdd_City_Name() {
        return BizLocAdd_City_Name;
    }

    public void setBizLocAdd_City_Name(String provider_BizLocAdd_City_Name) {
        BizLocAdd_City_Name = provider_BizLocAdd_City_Name;
    }

    public String getBizLocAdd_State_Name() {
        return BizLocAdd_State_Name;
    }

    public void setBizLocAdd_State_Name(String provider_BizLocAdd_State_Name) {
        BizLocAdd_State_Name = provider_BizLocAdd_State_Name;
    }

    public String getBizLocAdd_Postal_Code() {
        return BizLocAdd_Postal_Code;
    }

    public void setBizLocAdd_Postal_Code(String provider_BizLocAdd_Postal_Code) {
        BizLocAdd_Postal_Code = provider_BizLocAdd_Postal_Code;
    }

    public String getBizLocAdd_Country_Code_If_outside_US() {
        return BizLocAdd_Country_Code_If_outside_US;
    }

    public void setBizLocAdd_Country_Code_If_outside_US(String provider_BizLocAdd_Country_Code_If_outside_US) {
        BizLocAdd_Country_Code_If_outside_US = provider_BizLocAdd_Country_Code_If_outside_US;
    }

    public String getBizLocAdd_Telephone_Number() {
        return BizLocAdd_Telephone_Number;
    }

    public void setBizLocAdd_Telephone_Number(String provider_BizLocAdd_Telephone_Number) {
        BizLocAdd_Telephone_Number = provider_BizLocAdd_Telephone_Number;
    }

    public String getBizLocAdd_Fax_Number() {
        return BizLocAdd_Fax_Number;
    }

    public void setBizLocAdd_Fax_Number(String provider_BizLocAdd_Fax_Number) {
        BizLocAdd_Fax_Number = provider_BizLocAdd_Fax_Number;
    }

    public String getEnumeration_Date() {
        return Enumeration_Date;
    }

    public void setEnumeration_Date(String provider_Enumeration_Date) {
        Enumeration_Date = provider_Enumeration_Date;
    }

    public String getLast_Update_Date() {
        return Last_Update_Date;
    }

    public void setLast_Update_Date(String last_Update_Date) {
        Last_Update_Date = last_Update_Date;
    }

    public String getNPI_Deactivation_Reason_Code() {
        return NPI_Deactivation_Reason_Code;
    }

    public void setNPI_Deactivation_Reason_Code(String NPI_Deactivation_Reason_Code) {
        this.NPI_Deactivation_Reason_Code = NPI_Deactivation_Reason_Code;
    }

    public String getNPI_Deactivation_Date() {
        return NPI_Deactivation_Date;
    }

    public void setNPI_Deactivation_Date(String NPI_Deactivation_Date) {
        this.NPI_Deactivation_Date = NPI_Deactivation_Date;
    }

    public String getNPI_Reactivation_Date() {
        return NPI_Reactivation_Date;
    }

    public void setNPI_Reactivation_Date(String NPI_Reactivation_Date) {
        this.NPI_Reactivation_Date = NPI_Reactivation_Date;
    }

    public String getGender_Code() {
        return Gender_Code;
    }

    public void setGender_Code(String provider_Gender_Code) {
        Gender_Code = provider_Gender_Code;
    }

    public String getAuthOff_Last_Name() {
        return AuthOff_Last_Name;
    }

    public void setAuthOff_Last_Name(String authorized_Official_Last_Name) {
        AuthOff_Last_Name = authorized_Official_Last_Name;
    }

    public String getAuthOff_First_Name() {
        return AuthOff_First_Name;
    }

    public void setAuthOff_First_Name(String authorized_Official_First_Name) {
        AuthOff_First_Name = authorized_Official_First_Name;
    }

    public String getAuthOff_Middle_Name() {
        return AuthOff_Middle_Name;
    }

    public void setAuthOff_Middle_Name(String authorized_Official_Middle_Name) {
        AuthOff_Middle_Name = authorized_Official_Middle_Name;
    }

    public String getAuthOff_Title_or_Position() {
        return AuthOff_Title_or_Position;
    }

    public void setAuthOff_Title_or_Position(String authorized_Official_Title_or_Position) {
        AuthOff_Title_or_Position = authorized_Official_Title_or_Position;
    }

    public String getAuthOff_Telephone_Number() {
        return AuthOff_Telephone_Number;
    }

    public void setAuthOff_Telephone_Number(String authorized_Official_Telephone_Number) {
        AuthOff_Telephone_Number = authorized_Official_Telephone_Number;
    }

    public String getHealthcare_Tax_Code_1() {
        return bb_1;
    }

    public void setHealthcare_Tax_Code_1(String healthcare_Tax_Code_1) {
        bb_1 = healthcare_Tax_Code_1;
    }

    public String getdd_1() {
        return dd_1;
    }

    public void setdd_1(String provider_dd_1) {
        dd_1 = provider_dd_1;
    }

    public String getaa_1() {
        return aa_1;
    }

    public void setaa_1(String provider_aa_1) {
        aa_1 = provider_aa_1;
    }

    public String getHealthcare_Primary_Tax_Switch_1() {
        return HCPTS_1;
    }

    public void setHealthcare_Primary_Tax_Switch_1(String healthcare_Primary_Tax_Switch_1) {
        HCPTS_1 = healthcare_Primary_Tax_Switch_1;
    }

    public String getHealthcare_Tax_Code_2() {
        return bb_2;
    }

    public void setHealthcare_Tax_Code_2(String healthcare_Tax_Code_2) {
        bb_2 = healthcare_Tax_Code_2;
    }

    public String getdd_2() {
        return dd_2;
    }

    public void setdd_2(String provider_dd_2) {
        dd_2 = provider_dd_2;
    }

    public String getaa_2() {
        return aa_2;
    }

    public void setaa_2(String provider_aa_2) {
        aa_2 = provider_aa_2;
    }

    public String getHealthcare_Primary_Tax_Switch_2() {
        return HCPTS_2;
    }

    public void setHealthcare_Primary_Tax_Switch_2(String healthcare_Primary_Tax_Switch_2) {
        HCPTS_2 = healthcare_Primary_Tax_Switch_2;
    }

    public String getHealthcare_Tax_Code_3() {
        return bb_3;
    }

    public void setHealthcare_Tax_Code_3(String healthcare_Tax_Code_3) {
        bb_3 = healthcare_Tax_Code_3;
    }

    public String getdd_3() {
        return dd_3;
    }

    public void setdd_3(String provider_dd_3) {
        dd_3 = provider_dd_3;
    }

    public String getaa_3() {
        return aa_3;
    }

    public void setaa_3(String provider_aa_3) {
        aa_3 = provider_aa_3;
    }

    public String getHealthcare_Primary_Tax_Switch_3() {
        return HCPTS_3;
    }

    public void setHealthcare_Primary_Tax_Switch_3(String healthcare_Primary_Tax_Switch_3) {
        HCPTS_3 = healthcare_Primary_Tax_Switch_3;
    }

    public String getHealthcare_Tax_Code_4() {
        return bb_4;
    }

    public void setHealthcare_Tax_Code_4(String healthcare_Tax_Code_4) {
        bb_4 = healthcare_Tax_Code_4;
    }

    public String getdd_4() {
        return dd_4;
    }

    public void setdd_4(String provider_dd_4) {
        dd_4 = provider_dd_4;
    }

    public String getaa_4() {
        return aa_4;
    }

    public void setaa_4(String provider_aa_4) {
        aa_4 = provider_aa_4;
    }

    public String getHealthcare_Primary_Tax_Switch_4() {
        return HCPTS_4;
    }

    public void setHealthcare_Primary_Tax_Switch_4(String healthcare_Primary_Tax_Switch_4) {
        HCPTS_4 = healthcare_Primary_Tax_Switch_4;
    }

    public String getHealthcare_Tax_Code_5() {
        return bb_5;
    }

    public void setHealthcare_Tax_Code_5(String healthcare_Tax_Code_5) {
        bb_5 = healthcare_Tax_Code_5;
    }

    public String getdd_5() {
        return dd_5;
    }

    public void setdd_5(String provider_dd_5) {
        dd_5 = provider_dd_5;
    }

    public String getaa_5() {
        return aa_5;
    }

    public void setaa_5(String provider_aa_5) {
        aa_5 = provider_aa_5;
    }

    public String getHealthcare_Primary_Tax_Switch_5() {
        return HCPTS_5;
    }

    public void setHealthcare_Primary_Tax_Switch_5(String healthcare_Primary_Tax_Switch_5) {
        HCPTS_5 = healthcare_Primary_Tax_Switch_5;
    }

    public String getHealthcare_Tax_Code_6() {
        return bb_6;
    }

    public void setHealthcare_Tax_Code_6(String healthcare_Tax_Code_6) {
        bb_6 = healthcare_Tax_Code_6;
    }

    public String getdd_6() {
        return dd_6;
    }

    public void setdd_6(String provider_dd_6) {
        dd_6 = provider_dd_6;
    }

    public String getaa_6() {
        return aa_6;
    }

    public void setaa_6(String provider_aa_6) {
        aa_6 = provider_aa_6;
    }

    public String getHealthcare_Primary_Tax_Switch_6() {
        return HCPTS_6;
    }

    public void setHealthcare_Primary_Tax_Switch_6(String healthcare_Primary_Tax_Switch_6) {
        HCPTS_6 = healthcare_Primary_Tax_Switch_6;
    }

    public String getHealthcare_Tax_Code_7() {
        return bb_7;
    }

    public void setHealthcare_Tax_Code_7(String healthcare_Tax_Code_7) {
        bb_7 = healthcare_Tax_Code_7;
    }

    public String getdd_7() {
        return dd_7;
    }

    public void setdd_7(String provider_dd_7) {
        dd_7 = provider_dd_7;
    }

    public String getaa_7() {
        return aa_7;
    }

    public void setaa_7(String provider_aa_7) {
        aa_7 = provider_aa_7;
    }

    public String getHealthcare_Primary_Tax_Switch_7() {
        return HCPTS_7;
    }

    public void setHealthcare_Primary_Tax_Switch_7(String healthcare_Primary_Tax_Switch_7) {
        HCPTS_7 = healthcare_Primary_Tax_Switch_7;
    }

    public String getHealthcare_Tax_Code_8() {
        return bb_8;
    }

    public void setHealthcare_Tax_Code_8(String healthcare_Tax_Code_8) {
        bb_8 = healthcare_Tax_Code_8;
    }

    public String getdd_8() {
        return dd_8;
    }

    public void setdd_8(String provider_dd_8) {
        dd_8 = provider_dd_8;
    }

    public String getaa_8() {
        return aa_8;
    }

    public void setaa_8(String provider_aa_8) {
        aa_8 = provider_aa_8;
    }

    public String getHealthcare_Primary_Tax_Switch_8() {
        return HCPTS_8;
    }

    public void setHealthcare_Primary_Tax_Switch_8(String healthcare_Primary_Tax_Switch_8) {
        HCPTS_8 = healthcare_Primary_Tax_Switch_8;
    }

    public String getHealthcare_Tax_Code_9() {
        return bb_9;
    }

    public void setHealthcare_Tax_Code_9(String healthcare_Tax_Code_9) {
        bb_9 = healthcare_Tax_Code_9;
    }

    public String getdd_9() {
        return dd_9;
    }

    public void setdd_9(String provider_dd_9) {
        dd_9 = provider_dd_9;
    }

    public String getaa_9() {
        return aa_9;
    }

    public void setaa_9(String provider_aa_9) {
        aa_9 = provider_aa_9;
    }

    public String getHealthcare_Primary_Tax_Switch_9() {
        return HCPTS_9;
    }

    public void setHealthcare_Primary_Tax_Switch_9(String healthcare_Primary_Tax_Switch_9) {
        HCPTS_9 = healthcare_Primary_Tax_Switch_9;
    }

    public String getHealthcare_Tax_Code_10() {
        return bb_10;
    }

    public void setHealthcare_Tax_Code_10(String healthcare_Tax_Code_10) {
        bb_10 = healthcare_Tax_Code_10;
    }

    public String getdd_10() {
        return dd_10;
    }

    public void setdd_10(String provider_dd_10) {
        dd_10 = provider_dd_10;
    }

    public String getaa_10() {
        return aa_10;
    }

    public void setaa_10(String provider_aa_10) {
        aa_10 = provider_aa_10;
    }

    public String getHealthcare_Primary_Tax_Switch_10() {
        return HCPTS_10;
    }

    public void setHealthcare_Primary_Tax_Switch_10(String healthcare_Primary_Tax_Switch_10) {
        HCPTS_10 = healthcare_Primary_Tax_Switch_10;
    }

    public String getHealthcare_Tax_Code_11() {
        return bb_11;
    }

    public void setHealthcare_Tax_Code_11(String healthcare_Tax_Code_11) {
        bb_11 = healthcare_Tax_Code_11;
    }

    public String getdd_11() {
        return dd_11;
    }

    public void setdd_11(String provider_dd_11) {
        dd_11 = provider_dd_11;
    }

    public String getaa_11() {
        return aa_11;
    }

    public void setaa_11(String provider_aa_11) {
        aa_11 = provider_aa_11;
    }

    public String getHealthcare_Primary_Tax_Switch_11() {
        return HCPTS_11;
    }

    public void setHealthcare_Primary_Tax_Switch_11(String healthcare_Primary_Tax_Switch_11) {
        HCPTS_11 = healthcare_Primary_Tax_Switch_11;
    }

    public String getHealthcare_Tax_Code_12() {
        return bb_12;
    }

    public void setHealthcare_Tax_Code_12(String healthcare_Tax_Code_12) {
        bb_12 = healthcare_Tax_Code_12;
    }

    public String getdd_12() {
        return dd_12;
    }

    public void setdd_12(String provider_dd_12) {
        dd_12 = provider_dd_12;
    }

    public String getaa_12() {
        return aa_12;
    }

    public void setaa_12(String provider_aa_12) {
        aa_12 = provider_aa_12;
    }

    public String getHealthcare_Primary_Tax_Switch_12() {
        return HCPTS_12;
    }

    public void setHealthcare_Primary_Tax_Switch_12(String healthcare_Primary_Tax_Switch_12) {
        HCPTS_12 = healthcare_Primary_Tax_Switch_12;
    }

    public String getHealthcare_Tax_Code_13() {
        return bb_13;
    }

    public void setHealthcare_Tax_Code_13(String healthcare_Tax_Code_13) {
        bb_13 = healthcare_Tax_Code_13;
    }

    public String getdd_13() {
        return dd_13;
    }

    public void setdd_13(String provider_dd_13) {
        dd_13 = provider_dd_13;
    }

    public String getaa_13() {
        return aa_13;
    }

    public void setaa_13(String provider_aa_13) {
        aa_13 = provider_aa_13;
    }

    public String getHealthcare_Primary_Tax_Switch_13() {
        return HCPTS_13;
    }

    public void setHealthcare_Primary_Tax_Switch_13(String healthcare_Primary_Tax_Switch_13) {
        HCPTS_13 = healthcare_Primary_Tax_Switch_13;
    }

    public String getHealthcare_Tax_Code_14() {
        return bb_14;
    }

    public void setHealthcare_Tax_Code_14(String healthcare_Tax_Code_14) {
        bb_14 = healthcare_Tax_Code_14;
    }

    public String getdd_14() {
        return dd_14;
    }

    public void setdd_14(String provider_dd_14) {
        dd_14 = provider_dd_14;
    }

    public String getaa_14() {
        return aa_14;
    }

    public void setaa_14(String provider_aa_14) {
        aa_14 = provider_aa_14;
    }

    public String getHealthcare_Primary_Tax_Switch_14() {
        return HCPTS_14;
    }

    public void setHealthcare_Primary_Tax_Switch_14(String healthcare_Primary_Tax_Switch_14) {
        HCPTS_14 = healthcare_Primary_Tax_Switch_14;
    }

    public String getHealthcare_Tax_Code_15() {
        return bb_15;
    }

    public void setHealthcare_Tax_Code_15(String healthcare_Tax_Code_15) {
        bb_15 = healthcare_Tax_Code_15;
    }

    public String getdd_15() {
        return dd_15;
    }

    public void setdd_15(String provider_dd_15) {
        dd_15 = provider_dd_15;
    }

    public String getaa_15() {
        return aa_15;
    }

    public void setaa_15(String provider_aa_15) {
        aa_15 = provider_aa_15;
    }

    public String getHealthcare_Primary_Tax_Switch_15() {
        return HCPTS_15;
    }

    public void setHealthcare_Primary_Tax_Switch_15(String healthcare_Primary_Tax_Switch_15) {
        HCPTS_15 = healthcare_Primary_Tax_Switch_15;
    }

    public String getOI_1() {
        return OI_1;
    }

    public void setOI_1(String other_Identifier_1) {
        OI_1 = other_Identifier_1;
    }

    public String getOITC_1() {
        return OITC_1;
    }

    public void setOITC_1(String other_Identifier_Type_Code_1) {
        OITC_1 = other_Identifier_Type_Code_1;
    }

    public String getOIS_1() {
        return OIS_1;
    }

    public void setOIS_1(String other_Identifier_State_1) {
        OIS_1 = other_Identifier_State_1;
    }

    public String getOII_1() {
        return OII_1;
    }

    public void setOII_1(String other_Identifier_Issuer_1) {
        OII_1 = other_Identifier_Issuer_1;
    }

    public String getOI_2() {
        return OI_2;
    }

    public void setOI_2(String other_Identifier_2) {
        OI_2 = other_Identifier_2;
    }

    public String getOITC_2() {
        return OITC_2;
    }

    public void setOITC_2(String other_Identifier_Type_Code_2) {
        OITC_2 = other_Identifier_Type_Code_2;
    }

    public String getOIS_2() {
        return OIS_2;
    }

    public void setOIS_2(String other_Identifier_State_2) {
        OIS_2 = other_Identifier_State_2;
    }

    public String getOII_2() {
        return OII_2;
    }

    public void setOII_2(String other_Identifier_Issuer_2) {
        OII_2 = other_Identifier_Issuer_2;
    }

    public String getOI_3() {
        return OI_3;
    }

    public void setOI_3(String other_Identifier_3) {
        OI_3 = other_Identifier_3;
    }

    public String getOITC_3() {
        return OITC_3;
    }

    public void setOITC_3(String other_Identifier_Type_Code_3) {
        OITC_3 = other_Identifier_Type_Code_3;
    }

    public String getOIS_3() {
        return OIS_3;
    }

    public void setOIS_3(String other_Identifier_State_3) {
        OIS_3 = other_Identifier_State_3;
    }

    public String getOII_3() {
        return OII_3;
    }

    public void setOII_3(String other_Identifier_Issuer_3) {
        OII_3 = other_Identifier_Issuer_3;
    }

    public String getOI_4() {
        return OI_4;
    }

    public void setOI_4(String other_Identifier_4) {
        OI_4 = other_Identifier_4;
    }

    public String getOITC_4() {
        return OITC_4;
    }

    public void setOITC_4(String other_Identifier_Type_Code_4) {
        OITC_4 = other_Identifier_Type_Code_4;
    }

    public String getOIS_4() {
        return OIS_4;
    }

    public void setOIS_4(String other_Identifier_State_4) {
        OIS_4 = other_Identifier_State_4;
    }

    public String getOII_4() {
        return OII_4;
    }

    public void setOII_4(String other_Identifier_Issuer_4) {
        OII_4 = other_Identifier_Issuer_4;
    }

    public String getOI_5() {
        return OI_5;
    }

    public void setOI_5(String other_Identifier_5) {
        OI_5 = other_Identifier_5;
    }

    public String getOITC_5() {
        return OITC_5;
    }

    public void setOITC_5(String other_Identifier_Type_Code_5) {
        OITC_5 = other_Identifier_Type_Code_5;
    }

    public String getOIS_5() {
        return OIS_5;
    }

    public void setOIS_5(String other_Identifier_State_5) {
        OIS_5 = other_Identifier_State_5;
    }

    public String getOII_5() {
        return OII_5;
    }

    public void setOII_5(String other_Identifier_Issuer_5) {
        OII_5 = other_Identifier_Issuer_5;
    }

    public String getOI_6() {
        return OI_6;
    }

    public void setOI_6(String other_Identifier_6) {
        OI_6 = other_Identifier_6;
    }

    public String getOITC_6() {
        return OITC_6;
    }

    public void setOITC_6(String other_Identifier_Type_Code_6) {
        OITC_6 = other_Identifier_Type_Code_6;
    }

    public String getOIS_6() {
        return OIS_6;
    }

    public void setOIS_6(String other_Identifier_State_6) {
        OIS_6 = other_Identifier_State_6;
    }

    public String getOII_6() {
        return OII_6;
    }

    public void setOII_6(String other_Identifier_Issuer_6) {
        OII_6 = other_Identifier_Issuer_6;
    }

    public String getOI_7() {
        return OI_7;
    }

    public void setOI_7(String other_Identifier_7) {
        OI_7 = other_Identifier_7;
    }

    public String getOITC_7() {
        return OITC_7;
    }

    public void setOITC_7(String other_Identifier_Type_Code_7) {
        OITC_7 = other_Identifier_Type_Code_7;
    }

    public String getOIS_7() {
        return OIS_7;
    }

    public void setOIS_7(String other_Identifier_State_7) {
        OIS_7 = other_Identifier_State_7;
    }

    public String getOII_7() {
        return OII_7;
    }

    public void setOII_7(String other_Identifier_Issuer_7) {
        OII_7 = other_Identifier_Issuer_7;
    }

    public String getOI_8() {
        return OI_8;
    }

    public void setOI_8(String other_Identifier_8) {
        OI_8 = other_Identifier_8;
    }

    public String getOITC_8() {
        return OITC_8;
    }

    public void setOITC_8(String other_Identifier_Type_Code_8) {
        OITC_8 = other_Identifier_Type_Code_8;
    }

    public String getOIS_8() {
        return OIS_8;
    }

    public void setOIS_8(String other_Identifier_State_8) {
        OIS_8 = other_Identifier_State_8;
    }

    public String getOII_8() {
        return OII_8;
    }

    public void setOII_8(String other_Identifier_Issuer_8) {
        OII_8 = other_Identifier_Issuer_8;
    }

    public String getOI_9() {
        return OI_9;
    }

    public void setOI_9(String other_Identifier_9) {
        OI_9 = other_Identifier_9;
    }

    public String getOITC_9() {
        return OITC_9;
    }

    public void setOITC_9(String other_Identifier_Type_Code_9) {
        OITC_9 = other_Identifier_Type_Code_9;
    }

    public String getOIS_9() {
        return OIS_9;
    }

    public void setOIS_9(String other_Identifier_State_9) {
        OIS_9 = other_Identifier_State_9;
    }

    public String getOII_9() {
        return OII_9;
    }

    public void setOII_9(String other_Identifier_Issuer_9) {
        OII_9 = other_Identifier_Issuer_9;
    }

    public String getOI_10() {
        return OI_10;
    }

    public void setOI_10(String other_Identifier_10) {
        OI_10 = other_Identifier_10;
    }

    public String getOITC_10() {
        return OITC_10;
    }

    public void setOITC_10(String other_Identifier_Type_Code_10) {
        OITC_10 = other_Identifier_Type_Code_10;
    }

    public String getOIS_10() {
        return OIS_10;
    }

    public void setOIS_10(String other_Identifier_State_10) {
        OIS_10 = other_Identifier_State_10;
    }

    public String getOII_10() {
        return OII_10;
    }

    public void setOII_10(String other_Identifier_Issuer_10) {
        OII_10 = other_Identifier_Issuer_10;
    }

    public String getOI_11() {
        return OI_11;
    }

    public void setOI_11(String other_Identifier_11) {
        OI_11 = other_Identifier_11;
    }

    public String getOITC_11() {
        return OITC_11;
    }

    public void setOITC_11(String other_Identifier_Type_Code_11) {
        OITC_11 = other_Identifier_Type_Code_11;
    }

    public String getOIS_11() {
        return OIS_11;
    }

    public void setOIS_11(String other_Identifier_State_11) {
        OIS_11 = other_Identifier_State_11;
    }

    public String getOII_11() {
        return OII_11;
    }

    public void setOII_11(String other_Identifier_Issuer_11) {
        OII_11 = other_Identifier_Issuer_11;
    }

    public String getOI_12() {
        return OI_12;
    }

    public void setOI_12(String other_Identifier_12) {
        OI_12 = other_Identifier_12;
    }

    public String getOITC_12() {
        return OITC_12;
    }

    public void setOITC_12(String other_Identifier_Type_Code_12) {
        OITC_12 = other_Identifier_Type_Code_12;
    }

    public String getOIS_12() {
        return OIS_12;
    }

    public void setOIS_12(String other_Identifier_State_12) {
        OIS_12 = other_Identifier_State_12;
    }

    public String getOII_12() {
        return OII_12;
    }

    public void setOII_12(String other_Identifier_Issuer_12) {
        OII_12 = other_Identifier_Issuer_12;
    }

    public String getOI_13() {
        return OI_13;
    }

    public void setOI_13(String other_Identifier_13) {
        OI_13 = other_Identifier_13;
    }

    public String getOITC_13() {
        return OITC_13;
    }

    public void setOITC_13(String other_Identifier_Type_Code_13) {
        OITC_13 = other_Identifier_Type_Code_13;
    }

    public String getOIS_13() {
        return OIS_13;
    }

    public void setOIS_13(String other_Identifier_State_13) {
        OIS_13 = other_Identifier_State_13;
    }

    public String getOII_13() {
        return OII_13;
    }

    public void setOII_13(String other_Identifier_Issuer_13) {
        OII_13 = other_Identifier_Issuer_13;
    }

    public String getOI_14() {
        return OI_14;
    }

    public void setOI_14(String other_Identifier_14) {
        OI_14 = other_Identifier_14;
    }

    public String getOITC_14() {
        return OITC_14;
    }

    public void setOITC_14(String other_Identifier_Type_Code_14) {
        OITC_14 = other_Identifier_Type_Code_14;
    }

    public String getOIS_14() {
        return OIS_14;
    }

    public void setOIS_14(String other_Identifier_State_14) {
        OIS_14 = other_Identifier_State_14;
    }

    public String getOII_14() {
        return OII_14;
    }

    public void setOII_14(String other_Identifier_Issuer_14) {
        OII_14 = other_Identifier_Issuer_14;
    }

    public String getOI_15() {
        return OI_15;
    }

    public void setOI_15(String other_Identifier_15) {
        OI_15 = other_Identifier_15;
    }

    public String getOITC_15() {
        return OITC_15;
    }

    public void setOITC_15(String other_Identifier_Type_Code_15) {
        OITC_15 = other_Identifier_Type_Code_15;
    }

    public String getOIS_15() {
        return OIS_15;
    }

    public void setOIS_15(String other_Identifier_State_15) {
        OIS_15 = other_Identifier_State_15;
    }

    public String getOII_15() {
        return OII_15;
    }

    public void setOII_15(String other_Identifier_Issuer_15) {
        OII_15 = other_Identifier_Issuer_15;
    }

    public String getOI_16() {
        return OI_16;
    }

    public void setOI_16(String other_Identifier_16) {
        OI_16 = other_Identifier_16;
    }

    public String getOITC_16() {
        return OITC_16;
    }

    public void setOITC_16(String other_Identifier_Type_Code_16) {
        OITC_16 = other_Identifier_Type_Code_16;
    }

    public String getOIS_16() {
        return OIS_16;
    }

    public void setOIS_16(String other_Identifier_State_16) {
        OIS_16 = other_Identifier_State_16;
    }

    public String getOII_16() {
        return OII_16;
    }

    public void setOII_16(String other_Identifier_Issuer_16) {
        OII_16 = other_Identifier_Issuer_16;
    }

    public String getOI_17() {
        return OI_17;
    }

    public void setOI_17(String other_Identifier_17) {
        OI_17 = other_Identifier_17;
    }

    public String getOITC_17() {
        return OITC_17;
    }

    public void setOITC_17(String other_Identifier_Type_Code_17) {
        OITC_17 = other_Identifier_Type_Code_17;
    }

    public String getOIS_17() {
        return OIS_17;
    }

    public void setOIS_17(String other_Identifier_State_17) {
        OIS_17 = other_Identifier_State_17;
    }

    public String getOII_17() {
        return OII_17;
    }

    public void setOII_17(String other_Identifier_Issuer_17) {
        OII_17 = other_Identifier_Issuer_17;
    }

    public String getOI_18() {
        return OI_18;
    }

    public void setOI_18(String other_Identifier_18) {
        OI_18 = other_Identifier_18;
    }

    public String getOITC_18() {
        return OITC_18;
    }

    public void setOITC_18(String other_Identifier_Type_Code_18) {
        OITC_18 = other_Identifier_Type_Code_18;
    }

    public String getOIS_18() {
        return OIS_18;
    }

    public void setOIS_18(String other_Identifier_State_18) {
        OIS_18 = other_Identifier_State_18;
    }

    public String getOII_18() {
        return OII_18;
    }

    public void setOII_18(String other_Identifier_Issuer_18) {
        OII_18 = other_Identifier_Issuer_18;
    }

    public String getOI_19() {
        return OI_19;
    }

    public void setOI_19(String other_Identifier_19) {
        OI_19 = other_Identifier_19;
    }

    public String getOITC_19() {
        return OITC_19;
    }

    public void setOITC_19(String other_Identifier_Type_Code_19) {
        OITC_19 = other_Identifier_Type_Code_19;
    }

    public String getOIS_19() {
        return OIS_19;
    }

    public void setOIS_19(String other_Identifier_State_19) {
        OIS_19 = other_Identifier_State_19;
    }

    public String getOII_19() {
        return OII_19;
    }

    public void setOII_19(String other_Identifier_Issuer_19) {
        OII_19 = other_Identifier_Issuer_19;
    }

    public String getOI_20() {
        return OI_20;
    }

    public void setOI_20(String other_Identifier_20) {
        OI_20 = other_Identifier_20;
    }

    public String getOITC_20() {
        return OITC_20;
    }

    public void setOITC_20(String other_Identifier_Type_Code_20) {
        OITC_20 = other_Identifier_Type_Code_20;
    }

    public String getOIS_20() {
        return OIS_20;
    }

    public void setOIS_20(String other_Identifier_State_20) {
        OIS_20 = other_Identifier_State_20;
    }

    public String getOII_20() {
        return OII_20;
    }

    public void setOII_20(String other_Identifier_Issuer_20) {
        OII_20 = other_Identifier_Issuer_20;
    }

    public String getOI_21() {
        return OI_21;
    }

    public void setOI_21(String other_Identifier_21) {
        OI_21 = other_Identifier_21;
    }

    public String getOITC_21() {
        return OITC_21;
    }

    public void setOITC_21(String other_Identifier_Type_Code_21) {
        OITC_21 = other_Identifier_Type_Code_21;
    }

    public String getOIS_21() {
        return OIS_21;
    }

    public void setOIS_21(String other_Identifier_State_21) {
        OIS_21 = other_Identifier_State_21;
    }

    public String getOII_21() {
        return OII_21;
    }

    public void setOII_21(String other_Identifier_Issuer_21) {
        OII_21 = other_Identifier_Issuer_21;
    }

    public String getOI_22() {
        return OI_22;
    }

    public void setOI_22(String other_Identifier_22) {
        OI_22 = other_Identifier_22;
    }

    public String getOITC_22() {
        return OITC_22;
    }

    public void setOITC_22(String other_Identifier_Type_Code_22) {
        OITC_22 = other_Identifier_Type_Code_22;
    }

    public String getOIS_22() {
        return OIS_22;
    }

    public void setOIS_22(String other_Identifier_State_22) {
        OIS_22 = other_Identifier_State_22;
    }

    public String getOII_22() {
        return OII_22;
    }

    public void setOII_22(String other_Identifier_Issuer_22) {
        OII_22 = other_Identifier_Issuer_22;
    }

    public String getOI_23() {
        return OI_23;
    }

    public void setOI_23(String other_Identifier_23) {
        OI_23 = other_Identifier_23;
    }

    public String getOITC_23() {
        return OITC_23;
    }

    public void setOITC_23(String other_Identifier_Type_Code_23) {
        OITC_23 = other_Identifier_Type_Code_23;
    }

    public String getOIS_23() {
        return OIS_23;
    }

    public void setOIS_23(String other_Identifier_State_23) {
        OIS_23 = other_Identifier_State_23;
    }

    public String getOII_23() {
        return OII_23;
    }

    public void setOII_23(String other_Identifier_Issuer_23) {
        OII_23 = other_Identifier_Issuer_23;
    }

    public String getOI_24() {
        return OI_24;
    }

    public void setOI_24(String other_Identifier_24) {
        OI_24 = other_Identifier_24;
    }

    public String getOITC_24() {
        return OITC_24;
    }

    public void setOITC_24(String other_Identifier_Type_Code_24) {
        OITC_24 = other_Identifier_Type_Code_24;
    }

    public String getOIS_24() {
        return OIS_24;
    }

    public void setOIS_24(String other_Identifier_State_24) {
        OIS_24 = other_Identifier_State_24;
    }

    public String getOII_24() {
        return OII_24;
    }

    public void setOII_24(String other_Identifier_Issuer_24) {
        OII_24 = other_Identifier_Issuer_24;
    }

    public String getOI_25() {
        return OI_25;
    }

    public void setOI_25(String other_Identifier_25) {
        OI_25 = other_Identifier_25;
    }

    public String getOITC_25() {
        return OITC_25;
    }

    public void setOITC_25(String other_Identifier_Type_Code_25) {
        OITC_25 = other_Identifier_Type_Code_25;
    }

    public String getOIS_25() {
        return OIS_25;
    }

    public void setOIS_25(String other_Identifier_State_25) {
        OIS_25 = other_Identifier_State_25;
    }

    public String getOII_25() {
        return OII_25;
    }

    public void setOII_25(String other_Identifier_Issuer_25) {
        OII_25 = other_Identifier_Issuer_25;
    }

    public String getOI_26() {
        return OI_26;
    }

    public void setOI_26(String other_Identifier_26) {
        OI_26 = other_Identifier_26;
    }

    public String getOITC_26() {
        return OITC_26;
    }

    public void setOITC_26(String other_Identifier_Type_Code_26) {
        OITC_26 = other_Identifier_Type_Code_26;
    }

    public String getOIS_26() {
        return OIS_26;
    }

    public void setOIS_26(String other_Identifier_State_26) {
        OIS_26 = other_Identifier_State_26;
    }

    public String getOII_26() {
        return OII_26;
    }

    public void setOII_26(String other_Identifier_Issuer_26) {
        OII_26 = other_Identifier_Issuer_26;
    }

    public String getOI_27() {
        return OI_27;
    }

    public void setOI_27(String other_Identifier_27) {
        OI_27 = other_Identifier_27;
    }

    public String getOITC_27() {
        return OITC_27;
    }

    public void setOITC_27(String other_Identifier_Type_Code_27) {
        OITC_27 = other_Identifier_Type_Code_27;
    }

    public String getOIS_27() {
        return OIS_27;
    }

    public void setOIS_27(String other_Identifier_State_27) {
        OIS_27 = other_Identifier_State_27;
    }

    public String getOII_27() {
        return OII_27;
    }

    public void setOII_27(String other_Identifier_Issuer_27) {
        OII_27 = other_Identifier_Issuer_27;
    }

    public String getOI_28() {
        return OI_28;
    }

    public void setOI_28(String other_Identifier_28) {
        OI_28 = other_Identifier_28;
    }

    public String getOITC_28() {
        return OITC_28;
    }

    public void setOITC_28(String other_Identifier_Type_Code_28) {
        OITC_28 = other_Identifier_Type_Code_28;
    }

    public String getOIS_28() {
        return OIS_28;
    }

    public void setOIS_28(String other_Identifier_State_28) {
        OIS_28 = other_Identifier_State_28;
    }

    public String getOII_28() {
        return OII_28;
    }

    public void setOII_28(String other_Identifier_Issuer_28) {
        OII_28 = other_Identifier_Issuer_28;
    }

    public String getOI_29() {
        return OI_29;
    }

    public void setOI_29(String other_Identifier_29) {
        OI_29 = other_Identifier_29;
    }

    public String getOITC_29() {
        return OITC_29;
    }

    public void setOITC_29(String other_Identifier_Type_Code_29) {
        OITC_29 = other_Identifier_Type_Code_29;
    }

    public String getOIS_29() {
        return OIS_29;
    }

    public void setOIS_29(String other_Identifier_State_29) {
        OIS_29 = other_Identifier_State_29;
    }

    public String getOII_29() {
        return OII_29;
    }

    public void setOII_29(String other_Identifier_Issuer_29) {
        OII_29 = other_Identifier_Issuer_29;
    }

    public String getOI_30() {
        return OI_30;
    }

    public void setOI_30(String other_Identifier_30) {
        OI_30 = other_Identifier_30;
    }

    public String getOITC_30() {
        return OITC_30;
    }

    public void setOITC_30(String other_Identifier_Type_Code_30) {
        OITC_30 = other_Identifier_Type_Code_30;
    }

    public String getOIS_30() {
        return OIS_30;
    }

    public void setOIS_30(String other_Identifier_State_30) {
        OIS_30 = other_Identifier_State_30;
    }

    public String getOII_30() {
        return OII_30;
    }

    public void setOII_30(String other_Identifier_Issuer_30) {
        OII_30 = other_Identifier_Issuer_30;
    }

    public String getOI_31() {
        return OI_31;
    }

    public void setOI_31(String other_Identifier_31) {
        OI_31 = other_Identifier_31;
    }

    public String getOITC_31() {
        return OITC_31;
    }

    public void setOITC_31(String other_Identifier_Type_Code_31) {
        OITC_31 = other_Identifier_Type_Code_31;
    }

    public String getOIS_31() {
        return OIS_31;
    }

    public void setOIS_31(String other_Identifier_State_31) {
        OIS_31 = other_Identifier_State_31;
    }

    public String getOII_31() {
        return OII_31;
    }

    public void setOII_31(String other_Identifier_Issuer_31) {
        OII_31 = other_Identifier_Issuer_31;
    }

    public String getOI_32() {
        return OI_32;
    }

    public void setOI_32(String other_Identifier_32) {
        OI_32 = other_Identifier_32;
    }

    public String getOITC_32() {
        return OITC_32;
    }

    public void setOITC_32(String other_Identifier_Type_Code_32) {
        OITC_32 = other_Identifier_Type_Code_32;
    }

    public String getOIS_32() {
        return OIS_32;
    }

    public void setOIS_32(String other_Identifier_State_32) {
        OIS_32 = other_Identifier_State_32;
    }

    public String getOII_32() {
        return OII_32;
    }

    public void setOII_32(String other_Identifier_Issuer_32) {
        OII_32 = other_Identifier_Issuer_32;
    }

    public String getOI_33() {
        return OI_33;
    }

    public void setOI_33(String other_Identifier_33) {
        OI_33 = other_Identifier_33;
    }

    public String getOITC_33() {
        return OITC_33;
    }

    public void setOITC_33(String other_Identifier_Type_Code_33) {
        OITC_33 = other_Identifier_Type_Code_33;
    }

    public String getOIS_33() {
        return OIS_33;
    }

    public void setOIS_33(String other_Identifier_State_33) {
        OIS_33 = other_Identifier_State_33;
    }

    public String getOII_33() {
        return OII_33;
    }

    public void setOII_33(String other_Identifier_Issuer_33) {
        OII_33 = other_Identifier_Issuer_33;
    }

    public String getOI_34() {
        return OI_34;
    }

    public void setOI_34(String other_Identifier_34) {
        OI_34 = other_Identifier_34;
    }

    public String getOITC_34() {
        return OITC_34;
    }

    public void setOITC_34(String other_Identifier_Type_Code_34) {
        OITC_34 = other_Identifier_Type_Code_34;
    }

    public String getOIS_34() {
        return OIS_34;
    }

    public void setOIS_34(String other_Identifier_State_34) {
        OIS_34 = other_Identifier_State_34;
    }

    public String getOII_34() {
        return OII_34;
    }

    public void setOII_34(String other_Identifier_Issuer_34) {
        OII_34 = other_Identifier_Issuer_34;
    }

    public String getOI_35() {
        return OI_35;
    }

    public void setOI_35(String other_Identifier_35) {
        OI_35 = other_Identifier_35;
    }

    public String getOITC_35() {
        return OITC_35;
    }

    public void setOITC_35(String other_Identifier_Type_Code_35) {
        OITC_35 = other_Identifier_Type_Code_35;
    }

    public String getOIS_35() {
        return OIS_35;
    }

    public void setOIS_35(String other_Identifier_State_35) {
        OIS_35 = other_Identifier_State_35;
    }

    public String getOII_35() {
        return OII_35;
    }

    public void setOII_35(String other_Identifier_Issuer_35) {
        OII_35 = other_Identifier_Issuer_35;
    }

    public String getOI_36() {
        return OI_36;
    }

    public void setOI_36(String other_Identifier_36) {
        OI_36 = other_Identifier_36;
    }

    public String getOITC_36() {
        return OITC_36;
    }

    public void setOITC_36(String other_Identifier_Type_Code_36) {
        OITC_36 = other_Identifier_Type_Code_36;
    }

    public String getOIS_36() {
        return OIS_36;
    }

    public void setOIS_36(String other_Identifier_State_36) {
        OIS_36 = other_Identifier_State_36;
    }

    public String getOII_36() {
        return OII_36;
    }

    public void setOII_36(String other_Identifier_Issuer_36) {
        OII_36 = other_Identifier_Issuer_36;
    }

    public String getOI_37() {
        return OI_37;
    }

    public void setOI_37(String other_Identifier_37) {
        OI_37 = other_Identifier_37;
    }

    public String getOITC_37() {
        return OITC_37;
    }

    public void setOITC_37(String other_Identifier_Type_Code_37) {
        OITC_37 = other_Identifier_Type_Code_37;
    }

    public String getOIS_37() {
        return OIS_37;
    }

    public void setOIS_37(String other_Identifier_State_37) {
        OIS_37 = other_Identifier_State_37;
    }

    public String getOII_37() {
        return OII_37;
    }

    public void setOII_37(String other_Identifier_Issuer_37) {
        OII_37 = other_Identifier_Issuer_37;
    }

    public String getOI_38() {
        return OI_38;
    }

    public void setOI_38(String other_Identifier_38) {
        OI_38 = other_Identifier_38;
    }

    public String getOITC_38() {
        return OITC_38;
    }

    public void setOITC_38(String other_Identifier_Type_Code_38) {
        OITC_38 = other_Identifier_Type_Code_38;
    }

    public String getOIS_38() {
        return OIS_38;
    }

    public void setOIS_38(String other_Identifier_State_38) {
        OIS_38 = other_Identifier_State_38;
    }

    public String getOII_38() {
        return OII_38;
    }

    public void setOII_38(String other_Identifier_Issuer_38) {
        OII_38 = other_Identifier_Issuer_38;
    }

    public String getOI_39() {
        return OI_39;
    }

    public void setOI_39(String other_Identifier_39) {
        OI_39 = other_Identifier_39;
    }

    public String getOITC_39() {
        return OITC_39;
    }

    public void setOITC_39(String other_Identifier_Type_Code_39) {
        OITC_39 = other_Identifier_Type_Code_39;
    }

    public String getOIS_39() {
        return OIS_39;
    }

    public void setOIS_39(String other_Identifier_State_39) {
        OIS_39 = other_Identifier_State_39;
    }

    public String getOII_39() {
        return OII_39;
    }

    public void setOII_39(String other_Identifier_Issuer_39) {
        OII_39 = other_Identifier_Issuer_39;
    }

    public String getOI_40() {
        return OI_40;
    }

    public void setOI_40(String other_Identifier_40) {
        OI_40 = other_Identifier_40;
    }

    public String getOITC_40() {
        return OITC_40;
    }

    public void setOITC_40(String other_Identifier_Type_Code_40) {
        OITC_40 = other_Identifier_Type_Code_40;
    }

    public String getOIS_40() {
        return OIS_40;
    }

    public void setOIS_40(String other_Identifier_State_40) {
        OIS_40 = other_Identifier_State_40;
    }

    public String getOII_40() {
        return OII_40;
    }

    public void setOII_40(String other_Identifier_Issuer_40) {
        OII_40 = other_Identifier_Issuer_40;
    }

    public String getOI_41() {
        return OI_41;
    }

    public void setOI_41(String other_Identifier_41) {
        OI_41 = other_Identifier_41;
    }

    public String getOITC_41() {
        return OITC_41;
    }

    public void setOITC_41(String other_Identifier_Type_Code_41) {
        OITC_41 = other_Identifier_Type_Code_41;
    }

    public String getOIS_41() {
        return OIS_41;
    }

    public void setOIS_41(String other_Identifier_State_41) {
        OIS_41 = other_Identifier_State_41;
    }

    public String getOII_41() {
        return OII_41;
    }

    public void setOII_41(String other_Identifier_Issuer_41) {
        OII_41 = other_Identifier_Issuer_41;
    }

    public String getOI_42() {
        return OI_42;
    }

    public void setOI_42(String other_Identifier_42) {
        OI_42 = other_Identifier_42;
    }

    public String getOITC_42() {
        return OITC_42;
    }

    public void setOITC_42(String other_Identifier_Type_Code_42) {
        OITC_42 = other_Identifier_Type_Code_42;
    }

    public String getOIS_42() {
        return OIS_42;
    }

    public void setOIS_42(String other_Identifier_State_42) {
        OIS_42 = other_Identifier_State_42;
    }

    public String getOII_42() {
        return OII_42;
    }

    public void setOII_42(String other_Identifier_Issuer_42) {
        OII_42 = other_Identifier_Issuer_42;
    }

    public String getOI_43() {
        return OI_43;
    }

    public void setOI_43(String other_Identifier_43) {
        OI_43 = other_Identifier_43;
    }

    public String getOITC_43() {
        return OITC_43;
    }

    public void setOITC_43(String other_Identifier_Type_Code_43) {
        OITC_43 = other_Identifier_Type_Code_43;
    }

    public String getOIS_43() {
        return OIS_43;
    }

    public void setOIS_43(String other_Identifier_State_43) {
        OIS_43 = other_Identifier_State_43;
    }

    public String getOII_43() {
        return OII_43;
    }

    public void setOII_43(String other_Identifier_Issuer_43) {
        OII_43 = other_Identifier_Issuer_43;
    }

    public String getOI_44() {
        return OI_44;
    }

    public void setOI_44(String other_Identifier_44) {
        OI_44 = other_Identifier_44;
    }

    public String getOITC_44() {
        return OITC_44;
    }

    public void setOITC_44(String other_Identifier_Type_Code_44) {
        OITC_44 = other_Identifier_Type_Code_44;
    }

    public String getOIS_44() {
        return OIS_44;
    }

    public void setOIS_44(String other_Identifier_State_44) {
        OIS_44 = other_Identifier_State_44;
    }

    public String getOII_44() {
        return OII_44;
    }

    public void setOII_44(String other_Identifier_Issuer_44) {
        OII_44 = other_Identifier_Issuer_44;
    }

    public String getOI_45() {
        return OI_45;
    }

    public void setOI_45(String other_Identifier_45) {
        OI_45 = other_Identifier_45;
    }

    public String getOITC_45() {
        return OITC_45;
    }

    public void setOITC_45(String other_Identifier_Type_Code_45) {
        OITC_45 = other_Identifier_Type_Code_45;
    }

    public String getOIS_45() {
        return OIS_45;
    }

    public void setOIS_45(String other_Identifier_State_45) {
        OIS_45 = other_Identifier_State_45;
    }

    public String getOII_45() {
        return OII_45;
    }

    public void setOII_45(String other_Identifier_Issuer_45) {
        OII_45 = other_Identifier_Issuer_45;
    }

    public String getOI_46() {
        return OI_46;
    }

    public void setOI_46(String other_Identifier_46) {
        OI_46 = other_Identifier_46;
    }

    public String getOITC_46() {
        return OITC_46;
    }

    public void setOITC_46(String other_Identifier_Type_Code_46) {
        OITC_46 = other_Identifier_Type_Code_46;
    }

    public String getOIS_46() {
        return OIS_46;
    }

    public void setOIS_46(String other_Identifier_State_46) {
        OIS_46 = other_Identifier_State_46;
    }

    public String getOII_46() {
        return OII_46;
    }

    public void setOII_46(String other_Identifier_Issuer_46) {
        OII_46 = other_Identifier_Issuer_46;
    }

    public String getOI_47() {
        return OI_47;
    }

    public void setOI_47(String other_Identifier_47) {
        OI_47 = other_Identifier_47;
    }

    public String getOITC_47() {
        return OITC_47;
    }

    public void setOITC_47(String other_Identifier_Type_Code_47) {
        OITC_47 = other_Identifier_Type_Code_47;
    }

    public String getOIS_47() {
        return OIS_47;
    }

    public void setOIS_47(String other_Identifier_State_47) {
        OIS_47 = other_Identifier_State_47;
    }

    public String getOII_47() {
        return OII_47;
    }

    public void setOII_47(String other_Identifier_Issuer_47) {
        OII_47 = other_Identifier_Issuer_47;
    }

    public String getOI_48() {
        return OI_48;
    }

    public void setOI_48(String other_Identifier_48) {
        OI_48 = other_Identifier_48;
    }

    public String getOITC_48() {
        return OITC_48;
    }

    public void setOITC_48(String other_Identifier_Type_Code_48) {
        OITC_48 = other_Identifier_Type_Code_48;
    }

    public String getOIS_48() {
        return OIS_48;
    }

    public void setOIS_48(String other_Identifier_State_48) {
        OIS_48 = other_Identifier_State_48;
    }

    public String getOII_48() {
        return OII_48;
    }

    public void setOII_48(String other_Identifier_Issuer_48) {
        OII_48 = other_Identifier_Issuer_48;
    }

    public String getOI_49() {
        return OI_49;
    }

    public void setOI_49(String other_Identifier_49) {
        OI_49 = other_Identifier_49;
    }

    public String getOITC_49() {
        return OITC_49;
    }

    public void setOITC_49(String other_Identifier_Type_Code_49) {
        OITC_49 = other_Identifier_Type_Code_49;
    }

    public String getOIS_49() {
        return OIS_49;
    }

    public void setOIS_49(String other_Identifier_State_49) {
        OIS_49 = other_Identifier_State_49;
    }

    public String getOII_49() {
        return OII_49;
    }

    public void setOII_49(String other_Identifier_Issuer_49) {
        OII_49 = other_Identifier_Issuer_49;
    }

    public String getOI_50() {
        return OI_50;
    }

    public void setOI_50(String other_Identifier_50) {
        OI_50 = other_Identifier_50;
    }

    public String getOITC_50() {
        return OITC_50;
    }

    public void setOITC_50(String other_Identifier_Type_Code_50) {
        OITC_50 = other_Identifier_Type_Code_50;
    }

    public String getOIS_50() {
        return OIS_50;
    }

    public void setOIS_50(String other_Identifier_State_50) {
        OIS_50 = other_Identifier_State_50;
    }

    public String getOII_50() {
        return OII_50;
    }

    public void setOII_50(String other_Identifier_Issuer_50) {
        OII_50 = other_Identifier_Issuer_50;
    }

    public String getIs_Sole_Proprietor() {
        return Is_Sole_Proprietor;
    }

    public void setIs_Sole_Proprietor(String is_Sole_Proprietor) {
        Is_Sole_Proprietor = is_Sole_Proprietor;
    }

    public String getIs_Org_Subpart() {
        return Is_Org_Subpart;
    }

    public void setIs_Org_Subpart(String is_Org_Subpart) {
        Is_Org_Subpart = is_Org_Subpart;
    }

    public String getParent_Org_LBN() {
        return Parent_Org_LBN;
    }

    public void setParent_Org_LBN(String parent_Org_LBN) {
        Parent_Org_LBN = parent_Org_LBN;
    }

    public String getParent_Org_TIN() {
        return Parent_Org_TIN;
    }

    public void setParent_Org_TIN(String parent_Org_TIN) {
        Parent_Org_TIN = parent_Org_TIN;
    }

    public String getAuthOff_Name_Prefix_Text() {
        return AuthOff_Name_Prefix_Text;
    }

    public void setAuthOff_Name_Prefix_Text(String authorized_Official_Name_Prefix_Text) {
        AuthOff_Name_Prefix_Text = authorized_Official_Name_Prefix_Text;
    }

    public String getAuthOff_Name_Suffix_Text() {
        return AuthOff_Name_Suffix_Text;
    }

    public void setAuthOff_Name_Suffix_Text(String authorized_Official_Name_Suffix_Text) {
        AuthOff_Name_Suffix_Text = authorized_Official_Name_Suffix_Text;
    }

    public String getAuthOff_Credential_Text() {
        return AuthOff_Credential_Text;
    }

    public void setAuthOff_Credential_Text(String authorized_Official_Credential_Text) {
        AuthOff_Credential_Text = authorized_Official_Credential_Text;
    }

    public String gethh_1() {
        return hh_1;
    }

    public void sethh_1(String healthcare_Tax_Group_1) {
        hh_1 = healthcare_Tax_Group_1;
    }

    public String gethh_2() {
        return hh_2;
    }

    public void sethh_2(String healthcare_Tax_Group_2) {
        hh_2 = healthcare_Tax_Group_2;
    }

    public String gethh_3() {
        return hh_3;
    }

    public void sethh_3(String healthcare_Tax_Group_3) {
        hh_3 = healthcare_Tax_Group_3;
    }

    public String gethh_4() {
        return hh_4;
    }

    public void sethh_4(String healthcare_Tax_Group_4) {
        hh_4 = healthcare_Tax_Group_4;
    }

    public String gethh_5() {
        return hh_5;
    }

    public void sethh_5(String healthcare_Tax_Group_5) {
        hh_5 = healthcare_Tax_Group_5;
    }

    public String gethh_6() {
        return hh_6;
    }

    public void sethh_6(String healthcare_Tax_Group_6) {
        hh_6 = healthcare_Tax_Group_6;
    }

    public String gethh_7() {
        return hh_7;
    }

    public void sethh_7(String healthcare_Tax_Group_7) {
        hh_7 = healthcare_Tax_Group_7;
    }

    public String gethh_8() {
        return hh_8;
    }

    public void sethh_8(String healthcare_Tax_Group_8) {
        hh_8 = healthcare_Tax_Group_8;
    }

    public String gethh_9() {
        return hh_9;
    }

    public void sethh_9(String healthcare_Tax_Group_9) {
        hh_9 = healthcare_Tax_Group_9;
    }

    public String gethh_10() {
        return hh_10;
    }

    public void sethh_10(String healthcare_Tax_Group_10) {
        hh_10 = healthcare_Tax_Group_10;
    }

    public String gethh_11() {
        return hh_11;
    }

    public void sethh_11(String healthcare_Tax_Group_11) {
        hh_11 = healthcare_Tax_Group_11;
    }

    public String gethh_12() {
        return hh_12;
    }

    public void sethh_12(String healthcare_Tax_Group_12) {
        hh_12 = healthcare_Tax_Group_12;
    }

    public String gethh_13() {
        return hh_13;
    }

    public void sethh_13(String healthcare_Tax_Group_13) {
        hh_13 = healthcare_Tax_Group_13;
    }

    public String gethh_14() {
        return hh_14;
    }

    public void sethh_14(String healthcare_Tax_Group_14) {
        hh_14 = healthcare_Tax_Group_14;
    }

    public String gethh_15() {
        return hh_15;
    }

    public void sethh_15(String healthcare_Tax_Group_15) {
        hh_15 = healthcare_Tax_Group_15;
    }
}
