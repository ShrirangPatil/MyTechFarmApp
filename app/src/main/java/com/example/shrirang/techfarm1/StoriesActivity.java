package com.example.shrirang.techfarm1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);

        TextView str1 = (TextView)findViewById(R.id.str1);
        str1.setText("After three years of hard work and convincing 1,500 farmers to go organic, Arjun Suri," +
                " sees light in his search for a new green revolution.\n" +
                "Twenty-five-year-old Arjun Suri was heir to a large family-owned enterprise called Suri Enterprises. " +
                "The agro arm of the closely held business had a turnover of Rs 2 crore, and a clientele of over 2,000 farmers. " +
                "For over 30 years, his family supplied chemical fertilisers and hybrid seeds to farmers and built a sizeable " +
                "business in the small hillside town of Solan in Himachal Pradesh. The family also has business interests in the " +
                "distribution of pharmaceutical products as well as a stake in real estate in the region.\nAfter finishing college in " +
                "Delhi in 2013, he decided to spend time with farmers in the region. That’s when it dawned upon him that the pristine " +
                "green belt that Solan was known for was being destroyed by tonnes of chemical fertilisers and pesticides. " +
                "“I realised that while farmers were increasing the yield of the land they were underestimating the impact of " +
                "chemicals on the land and soil,” says Arjun");
        TextView str2 = (TextView) findViewById(R.id.str2);
        str2.setText("Arjun discussed this situation with his father and expressed his desire to help farmers switch to organic " +
                "farming by changing the way they did business. Initially, his father did not take him seriously thinking he was " +
                "young and naïve, but later agreed to go with Arjun. “He said I could change the way we did business provided I " +
                "started slowly and built a narrative for farmers, communicating to them that they need to change from chemicals to " +
                "organic fertiliser,” says Arjun.\n" +
                "But first, he had to change himself and his company before he built that narrative. Solan is known for horticulture " +
                "and is popular for its tomatoes. The problem was that even the farmers did not know what organic farming was.\n");
        TextView str3 = (TextView) findViewById(R.id.str3);
        str3.setText("Bio farming costs\n" +
                "Arjun discussed this situation with his father and expressed his desire to help farmers switch to organic farming by" +
                " changing the way they did business. Initially, his father did not take him seriously thinking he was young and " +
                "naïve, but later agreed to go with Arjun. “He said I could change the way we did business provided I started slowly" +
                " and built a narrative for farmers, communicating to them that they need to change from chemicals to organic " +
                "fertiliser,” says Arjun.\n" +
                "The Chemical Lobby" +
                "A good story often has a villain in the background, and in this case, it is the fertiliser and chemicals industry. " +
                "Arjun, however, laughs at the thought of them being called villains. He instead says that he had to streamline his" +
                " business process and prepare his team because revenues would fall. “I decided that, every year," +
                " I would reduce the percentage of chemicals that I sourced. The rest would be bio-fertilisers, with which I can " +
                "then work with a set of farmers to create an ecosystem in the district,” he says. Over the last three years, " +
                "the company has reduced the chemical intake by 50 percent in several farms." +
                "Arjun adds that he had a lot of convincing to do with farmers. The chemical companies remained happy because the " +
                "larger farmers continued to buy chemical fertilisers. But behind the scenes, Arjun had aggregated 1,500 farmers to " +
                "work on bio-fertilisers and organic items. It took three years to prepare these farmers to go organic. Each of them " +
                "gave him a small portion of their land to experiment with bio-fertilisers. Arjun convinced these farmers that in " +
                "three years, an organic farm would yield as much as one that was sprayed with a chemical called calcium nitrate. " +
                "“I proved this argument, and they agree that bio-fertilisers are better for the environment. But unfortunately, " +
                "they are happy to go back to chemicals because they believe that an organic farm is expensive, which it is not,” " +
                "says Arjun." +
                "“Corporates can push organic farming. It is the only way one can change the farm-to-fork connect. There is a need" +
                " for transparency and a lower chemical footprint in our agriculture,” says Harminder Sahni, founder of Wazir " +
                "Advisors, a consulting firm.");
        TextView str4 = (TextView) findViewById(R.id.str4);
        str4.setText("After setting a model in producing pesticide-free vegetables and providing it to the public at an affordable" +
                " price, a group of marginal farmers at Chekadi , a forest village on the lap of the South Wayanad forest division, " +
                "is preparing to expand the organic vegetable cultivation.\n" +
                "As many as 10 farmers, including six tribal farmers, of the ‘Haritakudumbam,’ a joint liability group (JLG), in the " +
                "hamlet launched pesticide-free vegetable cultivation around four months ago with the financial assistance of the " +
                "Pulpally Service Cooperative bank .\n" +
                "By utilising an interest-free loan of Rs. 15,000 provided by the bank to the JLG they disbursed 50 growbags each " +
                "to its members with eight varieties of hybrid vegetable seedlings such as green chilly, amaranths, beans, cucumber " +
                "and bitter gourd.\n" +
                "The Agriculture Department provided timely assistance to the venture.\n" +
                "The first harvest itself has proved the venture a big success.\n" +
                "The JLG is now procuring produces from its members at a premium price and selling the farm fresh vegetables directly" +
                " to the housing colonies at Sulthan Bathery every Sunday morning under the brand name ‘Sugandhika.’\n" +
                "“There is good demand for our produce as we provide pesticide-free vegetables at an affordable price. The farmers" +
                " are also happy as we procure their produce at a marginal price,” says Ajayan Chekadi, president, Haritakudumbam.\n" +
                "“We were able avoid the exploitation of middlemen and provide the profit directly to them,” Mr. Ajayan added.\n" +
                "Besides vegetables they are also selling pesticide-free oranges and ginger rhizomes being collected from organic " +
                "farmers at Tholpetty forest hamlet.\n" +
                "Mr. Ajayan says that there are 26 members, including 18 tribal members, in the JLG now and they are preparing " +
                "land to cultivate cool season vegetables on 12 acres of rented land with an interest-free loan of Rs.2.6 lakh " +
                "offered by the cooperative bank.\n" +
                "“The conditions inside the forest hamlet are quite suitable for organic farming and the Agriculture Department" +
                " would provide Rs. 15,000 under its vegetable development programme to promote the venture, apart from technical" +
                " assistance,” Lovely Augustine, Assistant Director, Agriculture Department told The Hindu .\n");
    }
}
