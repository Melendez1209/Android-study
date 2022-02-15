package com.example.Floating_card_navigation_bar;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.ramotion.expandingcollection.ECCardData;
import com.ramotion.expandingcollection.ECPagerView;
import com.ramotion.expandingcollection.ECPagerViewAdapter;

import java.util.List;

public class MainActivity extends Activity {

    private ECPagerView ecPagerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 从布局中获取寻呼机
        ecPagerView = (ECPagerView) findViewById(R.id.ec_pager_element);

        // 生成示例数据集
        List<ECCardData> dataset = ECCard_Adapter.generateExampleData();

        // 实现寻呼机适配器并将其连接到寻呼机视图
        ecPagerView.setPagerViewAdapter(new ECPagerViewAdapter(getApplicationContext(), dataset) {
            @Override
            public void instantiateCard(LayoutInflater inflaterService, ViewGroup head, ListView list, ECCardData data) {
                // Data object for current card
                ECCard_Adapter cardData = (ECCard_Adapter) data;

                // Set adapter and items to current card content list
                list.setAdapter(new CardListItemAdapter(getApplicationContext(), cardData.getListItems()));
                // Also some visual tuning can be done here
                list.setBackgroundColor(Color.WHITE);

                // Here we can create elements for head view or inflate layout from xml using inflater service
                TextView cardTitle = new TextView(getApplicationContext());
                cardTitle.setText(cardData.getCardTitle());
                cardTitle.setTextSize(COMPLEX_UNIT_DIP, 20);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
                layoutParams.gravity = Gravity.CENTER;
                head.addView(cardTitle, layoutParams);

                // Card toggling by click on head element
                head.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View v) {
                        ecPagerView.toggle();
                    }
                });
            }
        });

        // Add background switcher to pager view
        ecPagerView.setBackgroundSwitcherView((ECBackgroundSwitcherView) findViewById(R.id.ec_bg_switcher_element));

    }

    // Card collapse on back pressed
    @Override
    public void onBackPressed() {
        if (!ecPagerView.collapse())
            super.onBackPressed();
    }

}