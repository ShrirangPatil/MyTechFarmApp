package com.example.shrirang.techfarm1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class OrganicInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organic_info);

        Bitmap bitmap0 = BitmapFactory.decodeResource(this.getResources(),R.drawable.orgpic);
        String title0 = "History";
        String txt0 = "Agriculture was practiced for thousands of years without the use of artificial chemicals. Artificial " +
                "fertilizers were first created during the mid-19th century. These early fertilizers were cheap, powerful, and " +
                "easy to transport in bulk. Similar advances occurred in chemical pesticides in the 1940s, leading to the decade " +
                "being referred to as the 'pesticide era'. These new agricultural techniques, while beneficial in the short term, " +
                "had serious longer term side effects such as soil compaction, erosion, and declines in overall soil fertility, along " +
                "with health concerns about toxic chemicals entering the food supply. In the late 1800s and early 1900s, soil " +
                "biology scientists began to seek ways to remedy these side effects while still maintaining higher production.";
        Bitmap bitmap1 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.crop_divercity);
        String title1 = "Crop Diversity";
        String txt1 = "Organic farming encourages Crop diversity. The science of agroecology has revealed the benefits of polyculture" +
                "(multiple crops in the same space), which is often employed in organic farming. Planting a variety of vegetable" +
                "crops supports a wider range of beneficial insects, soil microorganisms, and other factors that add up to overall" +
                "farm health. Crop diversity helps environments thrive and protects species from going extinct.";

        Bitmap bitmap2 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.soil_managment);
        String title2 = "Soil management";
        String txt2 = "Organic farming relies heavily on the natural breakdown of organic matter, using techniques like green manure " +
                "and composting, to replace nutrients taken from the soil by previous crops. This biological process, driven by " +
                "microorganisms such as mycorrhiza, allows the natural production of nutrients in the soil throughout the growing " +
                "season, and has been referred to as feeding the soil to feed the plant. Organic farming uses a variety of methods " +
                "to improve soil fertility, including crop rotation, cover cropping, reduced tillage, and application of compost. " +
                "By reducing tillage, soil is not inverted and exposed to air; less carbon is lost to the atmosphere resulting in " +
                "more soil organic carbon. This has an added benefit of carbon sequestration, which can reduce green house gases and " +
                "help reverse climate change.";

        Bitmap bitmap3 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.weed_management);
        String title3 = "Weed management";
        String txt3 = "Organic weed management promotes weed suppression, rather than weed elimination, by enhancing crop competition " +
                "and phytotoxic effects on weeds.Organic farmers integrate cultural, biological, mechanical, physical and " +
                "chemical tactics to manage weeds without synthetic herbicides.";

        Bitmap bitmap4 = BitmapFactory.decodeResource(this.getResources(),R.drawable.compost);
        String title4 = "Composting";
        String txt4 = "Using manure as a fertilizer risks contaminating food with animal gut bacteria, including pathogenic strains " +
                "of E. coli that have caused fatal poisoning from eating organic food.To combat this risk, USDA organic " +
                "standards require that manure must be sterilized through high temperature thermophilic composting. If raw animal " +
                "manure is used, 120 days must pass before the crop is harvested if the final product comes into direct contact with " +
                "the soil. For products that don't directly contact soil, 90 days must pass prior to harvest.";
        ArrayList<OrganicC> organicCs = new ArrayList<OrganicC>();
        organicCs.add(new OrganicC(txt0,title0,bitmap0));
        organicCs.add(new OrganicC(txt1,title1,bitmap1));
        organicCs.add(new OrganicC(txt2,title2,bitmap2));
        organicCs.add(new OrganicC(txt3,title3,bitmap3));
        organicCs.add(new OrganicC(txt4,title4,bitmap4));


        OrganicAdapter<OrganicC> itemAdapter = new OrganicAdapter<>(this,organicCs);

        ListView listView = (ListView) findViewById(R.id.organic_list);
        listView.setAdapter(itemAdapter);
    }
}
