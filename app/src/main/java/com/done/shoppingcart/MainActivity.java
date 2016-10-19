package com.done.shoppingcart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.done.shoppingcart.entity.ShoppingCartBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @BindView(R.id.tvEditAll)
    TextView tvEditAll;
    @BindView(R.id.image)
    ImageView image;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.shopping_cart_empty)
    LinearLayout shoppingCartEmpty;
    @BindView(R.id.shopping_cart_list)
    ExpandableListView shoppingCartList;
    @BindView(R.id.select_all)
    CheckBox selectAll;
    @BindView(R.id.tvCountMoney)
    TextView tvCountMoney;
    @BindView(R.id.tvPostPrice)
    TextView tvPostPrice;
    @BindView(R.id.goods_count)
    TextView goodsCount;
    @BindView(R.id.bottom_bar)
    RelativeLayout bottomBar;

    private List<ShoppingCartBean> ShoppingCartList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
 