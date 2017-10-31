package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.a.k;
import com.tencent.mm.plugin.card.a.k.a;
import com.tencent.mm.plugin.card.b.b;
import com.tencent.mm.plugin.card.b.d.a;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.g.a;
import com.tencent.mm.plugin.card.model.g.b;
import com.tencent.mm.plugin.card.model.h;
import com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI;
import com.tencent.mm.pluginsdk.i.n;
import com.tencent.mm.protocal.c.jd;
import com.tencent.mm.protocal.c.jh;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.List;

public class CardNewMsgUI
  extends MMActivity
  implements k.a
{
  private ListView EA;
  View.OnClickListener iom;
  private View jJA;
  private View jrT;
  private a kya;
  private View kyb;
  private boolean kyc;
  
  public CardNewMsgUI()
  {
    GMTrace.i(5001757851648L, 37266);
    this.kyb = null;
    this.kyc = false;
    this.iom = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(4925387964416L, 36697);
        if (paramAnonymousView.getId() == R.h.bFP)
        {
          paramAnonymousView = (com.tencent.mm.plugin.card.model.g)paramAnonymousView.getTag();
          if ((paramAnonymousView == null) || (paramAnonymousView.ajs() == null))
          {
            GMTrace.o(4925387964416L, 36697);
            return;
          }
          com.tencent.mm.plugin.report.service.g.paX.i(11941, new Object[] { Integer.valueOf(2), paramAnonymousView.field_card_id, paramAnonymousView.field_card_tp_id, paramAnonymousView.field_msg_id, "" });
          if (paramAnonymousView.ajs().kpb == 0)
          {
            w.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_BUTTON_TYPE_URL");
            if (!TextUtils.isEmpty(paramAnonymousView.ajs().url))
            {
              b.a(CardNewMsgUI.this, paramAnonymousView.ajs().url, 2);
              GMTrace.o(4925387964416L, 36697);
              return;
            }
            w.e("MicroMsg.CardNewMsgUI", "card msg button url is empty");
            GMTrace.o(4925387964416L, 36697);
            return;
          }
          if (paramAnonymousView.ajs().kpb == 1)
          {
            w.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_BUTTON_TYPE_SHOP");
            Intent localIntent = new Intent();
            localIntent.putExtra("KEY_CARD_ID", paramAnonymousView.field_card_id);
            localIntent.putExtra("KEY_CARD_TP_ID", paramAnonymousView.field_card_tp_id);
            localIntent.setClass(CardNewMsgUI.this, CardShopUI.class);
            CardNewMsgUI.this.startActivity(localIntent);
            com.tencent.mm.plugin.report.service.g.paX.i(11324, new Object[] { "UsedStoresView", Integer.valueOf(paramAnonymousView.field_card_type), paramAnonymousView.field_card_tp_id, paramAnonymousView.field_card_id, Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), "" });
          }
          GMTrace.o(4925387964416L, 36697);
          return;
        }
        if (paramAnonymousView.getId() == R.h.chG)
        {
          paramAnonymousView = (com.tencent.mm.plugin.card.model.g)paramAnonymousView.getTag();
          if ((paramAnonymousView == null) || (paramAnonymousView.ajt() == null))
          {
            GMTrace.o(4925387964416L, 36697);
            return;
          }
          if (paramAnonymousView.ajt().type == 0)
          {
            w.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_OPERATION_REGION_TYPE_TEXT");
            if (!TextUtils.isEmpty(paramAnonymousView.ajt().url))
            {
              b.a(CardNewMsgUI.this, paramAnonymousView.ajt().url, 2);
              GMTrace.o(4925387964416L, 36697);
              return;
            }
            w.e("MicroMsg.CardNewMsgUI", "card msg oper region url is empty");
            GMTrace.o(4925387964416L, 36697);
            return;
          }
          if (paramAnonymousView.ajt().type == 1) {
            w.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_OPERATION_REGION_TYPE_CARDS");
          }
        }
        GMTrace.o(4925387964416L, 36697);
      }
    };
    GMTrace.o(5001757851648L, 37266);
  }
  
  private void Q(String paramString, boolean paramBoolean)
  {
    GMTrace.i(5002563158016L, 37272);
    Intent localIntent = new Intent(this, CardDetailUI.class);
    localIntent.putExtra("key_card_id", paramString);
    localIntent.putExtra("key_is_share_card", paramBoolean);
    localIntent.putExtra("key_from_scene", 4);
    startActivity(localIntent);
    GMTrace.o(5002563158016L, 37272);
  }
  
  private void akd()
  {
    GMTrace.i(5002428940288L, 37271);
    k localk = al.ajG();
    int i;
    if ((localk.knh == null) || (localk.knh.isEmpty()))
    {
      i = 0;
      if (i <= 0) {
        break label88;
      }
      this.EA.setVisibility(0);
      this.jJA.setVisibility(8);
      kS(true);
    }
    for (;;)
    {
      this.kya.notifyDataSetChanged();
      GMTrace.o(5002428940288L, 37271);
      return;
      i = localk.knh.size();
      break;
      label88:
      this.EA.setVisibility(8);
      this.jJA.setVisibility(0);
      kS(false);
    }
  }
  
  protected final void MH()
  {
    GMTrace.i(5002294722560L, 37270);
    oC(R.l.dFQ);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5000013021184L, 37253);
        CardNewMsgUI.this.finish();
        GMTrace.o(5000013021184L, 37253);
        return true;
      }
    });
    this.EA = ((ListView)findViewById(R.h.bqy));
    this.kya = new a();
    this.EA.setAdapter(this.kya);
    this.EA.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(4988067643392L, 37164);
        if (paramAnonymousInt == CardNewMsgUI.a(CardNewMsgUI.this).getCount())
        {
          paramAnonymousInt = 1;
          if (al.ajE().Mw() > 0) {
            al.ajE().ajx();
          }
          for (;;)
          {
            CardNewMsgUI.a(CardNewMsgUI.this).a(null, null);
            if (!CardNewMsgUI.b(CardNewMsgUI.this))
            {
              if (CardNewMsgUI.c(CardNewMsgUI.this).getParent() != null)
              {
                w.d("MicroMsg.CardNewMsgUI", "remove footer");
                CardNewMsgUI.d(CardNewMsgUI.this).removeFooterView(CardNewMsgUI.c(CardNewMsgUI.this));
              }
              if ((!CardNewMsgUI.a(CardNewMsgUI.this).alk()) && (CardNewMsgUI.e(CardNewMsgUI.this).getParent() == null) && (paramAnonymousInt > 0))
              {
                CardNewMsgUI.d(CardNewMsgUI.this).addFooterView(CardNewMsgUI.e(CardNewMsgUI.this));
                w.i("MicroMsg.CardNewMsgUI", "add mLoadingFooterView");
              }
            }
            CardNewMsgUI.f(CardNewMsgUI.this);
            CardNewMsgUI.c(CardNewMsgUI.this).setVisibility(8);
            GMTrace.o(4988067643392L, 37164);
            return;
            paramAnonymousInt = CardNewMsgUI.a(CardNewMsgUI.this).all();
          }
        }
        CardNewMsgUI.a(CardNewMsgUI.this, paramAnonymousInt);
        GMTrace.o(4988067643392L, 37164);
      }
    });
    this.EA.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5030212009984L, 37478);
        CardNewMsgUI.b(CardNewMsgUI.this, paramAnonymousInt);
        GMTrace.o(5030212009984L, 37478);
        return true;
      }
    });
    this.EA.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(4938809737216L, 36797);
        GMTrace.o(4938809737216L, 36797);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(4938675519488L, 36796);
        if (!CardNewMsgUI.b(CardNewMsgUI.this))
        {
          GMTrace.o(4938675519488L, 36796);
          return;
        }
        if (paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1)
        {
          if (al.ajE().Mw() > 0) {
            al.ajE().ajx();
          }
          for (;;)
          {
            CardNewMsgUI.a(CardNewMsgUI.this).a(null, null);
            GMTrace.o(4938675519488L, 36796);
            return;
            CardNewMsgUI.a(CardNewMsgUI.this).all();
          }
        }
        GMTrace.o(4938675519488L, 36796);
      }
    });
    this.kya.voo = new o.a()
    {
      public final void Qx()
      {
        GMTrace.i(5009945133056L, 37327);
        CardNewMsgUI.g(CardNewMsgUI.this);
        if ((CardNewMsgUI.a(CardNewMsgUI.this).alk()) && (al.ajE().Mw() == 0)) {
          CardNewMsgUI.c(CardNewMsgUI.this).setVisibility(8);
        }
        GMTrace.o(5009945133056L, 37327);
      }
      
      public final void Qy()
      {
        GMTrace.i(5009810915328L, 37326);
        GMTrace.o(5009810915328L, 37326);
      }
    };
    a(0, getString(R.l.dER), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5030748880896L, 37482);
        com.tencent.mm.plugin.report.service.g.paX.i(11582, new Object[] { "CardMsgClearMenu", Integer.valueOf(2), Integer.valueOf(0), "", "", "" });
        CardNewMsgUI.h(CardNewMsgUI.this);
        GMTrace.o(5030748880896L, 37482);
        return true;
      }
    });
    this.jJA = findViewById(R.h.bzd);
    akd();
    this.jrT = v.fa(this).inflate(R.i.cOv, null);
    this.kyb = v.fa(this).inflate(R.i.dan, null);
    int i = al.ajE().Mw();
    if (i > 0)
    {
      this.EA.addFooterView(this.jrT);
      GMTrace.o(5002294722560L, 37270);
      return;
    }
    if ((!this.kya.alk()) && (i == 0) && (al.ajE().getCount() > 0))
    {
      this.EA.addFooterView(this.kyb);
      this.kyc = true;
      GMTrace.o(5002294722560L, 37270);
      return;
    }
    if ((this.kya.alk()) && (i == 0)) {
      al.ajE().getCount();
    }
    GMTrace.o(5002294722560L, 37270);
  }
  
  public final void a(com.tencent.mm.plugin.card.model.g paramg)
  {
    GMTrace.i(5002697375744L, 37273);
    if (((paramg.field_msg_type & 0x1) == 0) || ((paramg.field_msg_type & 0x3) == 0))
    {
      GMTrace.o(5002697375744L, 37273);
      return;
    }
    akd();
    this.kya.a(null, null);
    GMTrace.o(5002697375744L, 37273);
  }
  
  public final void ahA()
  {
    GMTrace.i(5002831593472L, 37274);
    GMTrace.o(5002831593472L, 37274);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5001892069376L, 37267);
    int i = R.i.cOy;
    GMTrace.o(5001892069376L, 37267);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5002026287104L, 37268);
    super.onCreate(paramBundle);
    MH();
    al.ajG().a(this);
    al.ajG().ajp();
    GMTrace.o(5002026287104L, 37268);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5002160504832L, 37269);
    this.kya.aIb();
    al.ajG().b(this);
    if (al.ajE().Mw() > 0) {
      al.ajE().ajx();
    }
    super.onDestroy();
    GMTrace.o(5002160504832L, 37269);
  }
  
  final class a
    extends o<com.tencent.mm.plugin.card.model.g>
  {
    private int hIP;
    private int kye;
    
    public a()
    {
      super(new com.tencent.mm.plugin.card.model.g());
      GMTrace.i(4927535448064L, 36713);
      this.kye = 10;
      this.hIP = this.kye;
      kP(true);
      GMTrace.o(4927535448064L, 36713);
    }
    
    private void a(List<g.a> paramList, List<g.b> paramList1, CardNewMsgUI.b paramb, final com.tencent.mm.plugin.card.model.g paramg)
    {
      GMTrace.i(4928340754432L, 36719);
      paramb.kyt.removeAllViews();
      if (((paramList == null) || (paramList.size() == 0)) && ((paramList1 == null) || (paramList1.size() == 0)))
      {
        paramb.kyu.setVisibility(8);
        GMTrace.o(4928340754432L, 36719);
        return;
      }
      int i;
      final Object localObject1;
      Object localObject2;
      if (!bg.bX(paramList))
      {
        i = 0;
        if (i < paramList.size())
        {
          localObject1 = (g.a)paramList.get(i);
          localObject2 = View.inflate(CardNewMsgUI.this.vov.voR, R.i.cNM, null);
          if (i == 0) {
            ((View)localObject2).findViewById(R.h.boy).setVisibility(8);
          }
          ((TextView)((View)localObject2).findViewById(R.h.boA)).setText(((g.a)localObject1).title);
          ((TextView)((View)localObject2).findViewById(R.h.boz)).setText(((g.a)localObject1).koY);
          Button localButton = (Button)((View)localObject2).findViewById(R.h.box);
          localButton.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(5022427381760L, 37420);
              paramAnonymousView = new Intent();
              if (localObject1.kpb == 0)
              {
                paramAnonymousView.setClass(CardNewMsgUI.this.vov.voR, CardDetailUI.class);
                paramAnonymousView.putExtra("key_card_id", localObject1.cardId);
                paramAnonymousView.putExtra("key_card_ext", localObject1.koZ);
                paramAnonymousView.putExtra("key_from_scene", 17);
                CardNewMsgUI.this.startActivity(paramAnonymousView);
              }
              for (;;)
              {
                com.tencent.mm.plugin.report.service.g.paX.i(11941, new Object[] { Integer.valueOf(8), paramg.field_card_id, paramg.field_card_tp_id, paramg.field_msg_id, localObject1.cardId });
                GMTrace.o(5022427381760L, 37420);
                return;
                if (localObject1.kpb == 1)
                {
                  paramAnonymousView.setClass(CardNewMsgUI.this.vov.voR, CardConsumeSuccessUI.class);
                  paramAnonymousView.putExtra("key_card_id", paramg.field_card_id);
                  paramAnonymousView.putExtra("key_from_scene", 2);
                  CardNewMsgUI.this.startActivity(paramAnonymousView);
                }
              }
            }
          });
          if (((g.a)localObject1).kpb == 0) {
            localButton.setText(R.l.boA);
          }
          for (;;)
          {
            paramb.kyt.addView((View)localObject2);
            i += 1;
            break;
            if (((g.a)localObject1).kpb == 1) {
              localButton.setText(R.l.dEx);
            }
          }
        }
      }
      if (!bg.bX(paramList1))
      {
        i = 0;
        while (i < paramList1.size())
        {
          paramg = (g.b)paramList1.get(i);
          localObject1 = View.inflate(CardNewMsgUI.this.vov.voR, R.i.cNM, null);
          if ((i == 0) && (bg.bX(paramList))) {
            ((View)localObject1).findViewById(R.h.boy).setVisibility(8);
          }
          ((TextView)((View)localObject1).findViewById(R.h.boA)).setText(paramg.title);
          ((TextView)((View)localObject1).findViewById(R.h.boz)).setText(paramg.description);
          localObject2 = (Button)((View)localObject1).findViewById(R.h.box);
          ((Button)localObject2).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(4938407084032L, 36794);
              if (!TextUtils.isEmpty(paramg.kpe))
              {
                b.a(CardNewMsgUI.this, paramg.kpe, 2);
                GMTrace.o(4938407084032L, 36794);
                return;
              }
              w.e("MicroMsg.CardNewMsgUI", "card msg button url is empty");
              GMTrace.o(4938407084032L, 36794);
            }
          });
          ((Button)localObject2).setText(paramg.kpd);
          paramb.kyt.addView((View)localObject1);
          i += 1;
        }
      }
      paramb.kyu.setVisibility(0);
      GMTrace.o(4928340754432L, 36719);
    }
    
    public final void QA()
    {
      GMTrace.i(4927669665792L, 36714);
      if (al.ajE().Mw() > 0) {
        setCursor(al.ajE().gMB.rawQuery("select * from CardMsgInfo where read_state = ?  order by time desc", new String[] { "1" }));
      }
      for (;;)
      {
        notifyDataSetChanged();
        GMTrace.o(4927669665792L, 36714);
        return;
        this.hIP = al.ajE().getCount();
        h localh = al.ajE();
        int i = this.kye;
        String str = "select * from CardMsgInfo order by time desc LIMIT " + i;
        setCursor(localh.gMB.rawQuery(str, null));
      }
    }
    
    protected final void QB()
    {
      GMTrace.i(4927803883520L, 36715);
      aIb();
      QA();
      GMTrace.o(4927803883520L, 36715);
    }
    
    public final boolean alk()
    {
      GMTrace.i(4927938101248L, 36716);
      if (this.kye >= this.hIP)
      {
        GMTrace.o(4927938101248L, 36716);
        return true;
      }
      GMTrace.o(4927938101248L, 36716);
      return false;
    }
    
    public final int all()
    {
      GMTrace.i(4928072318976L, 36717);
      if (alk())
      {
        if (CardNewMsgUI.e(CardNewMsgUI.this).getParent() != null) {
          CardNewMsgUI.d(CardNewMsgUI.this).removeFooterView(CardNewMsgUI.e(CardNewMsgUI.this));
        }
        GMTrace.o(4928072318976L, 36717);
        return 0;
      }
      this.kye += 10;
      if (this.kye <= this.hIP)
      {
        GMTrace.o(4928072318976L, 36717);
        return 10;
      }
      this.kye = this.hIP;
      int i = this.hIP;
      GMTrace.o(4928072318976L, 36717);
      return i % 10;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(4928206536704L, 36718);
      com.tencent.mm.plugin.card.model.g localg = (com.tencent.mm.plugin.card.model.g)getItem(paramInt);
      int i;
      if (paramView == null)
      {
        paramView = View.inflate(CardNewMsgUI.this.vov.voR, R.i.cOw, null);
        paramViewGroup = new CardNewMsgUI.b(CardNewMsgUI.this);
        paramViewGroup.kyj = ((ImageView)paramView.findViewById(R.h.logo));
        paramViewGroup.kyk = paramView.findViewById(R.h.brv);
        paramViewGroup.kyl = ((ImageView)paramView.findViewById(R.h.bru));
        paramViewGroup.kym = ((TextView)paramView.findViewById(R.h.cBJ));
        paramViewGroup.kyn = ((TextView)paramView.findViewById(R.h.cAQ));
        paramViewGroup.kyo = ((TextView)paramView.findViewById(R.h.bAz));
        paramViewGroup.kyp = ((TextView)paramView.findViewById(R.h.bFP));
        paramViewGroup.kyq = ((TextView)paramView.findViewById(R.h.cyN));
        paramViewGroup.kyr = paramView.findViewById(R.h.chG);
        paramViewGroup.kys = ((TextView)paramView.findViewById(R.h.chH));
        paramViewGroup.kyt = ((LinearLayout)paramView.findViewById(R.h.bfX));
        paramViewGroup.kyu = ((LinearLayout)paramView.findViewById(R.h.bfY));
        paramView.setTag(paramViewGroup);
        paramViewGroup.kym.setText(localg.field_title);
        long l = localg.field_time;
        paramViewGroup.kyn.setText(n.c(CardNewMsgUI.this, l * 1000L, true));
        paramViewGroup.kyo.setText(localg.field_description);
        i = CardNewMsgUI.this.getResources().getDimensionPixelSize(R.f.aTd);
        w.d("MicroMsg.CardNewMsgUI", "CardNewMsgUI getView () position : " + paramInt + " logo_url :  " + localg.field_logo_url);
        if (!TextUtils.isEmpty(localg.field_logo_color)) {
          break label570;
        }
        paramViewGroup.kyk.setVisibility(8);
        paramViewGroup.kyj.setVisibility(0);
        paramViewGroup.kyj.setImageResource(R.g.baR);
        m.a(paramViewGroup.kyj, localg.field_logo_url, i, R.g.baR, true);
        label381:
        Object localObject = localg.ajs();
        if ((localObject == null) || (TextUtils.isEmpty(((jd)localObject).text))) {
          break label688;
        }
        paramViewGroup.kyp.setText(((jd)localObject).text);
        paramViewGroup.kyp.setTag(localg);
        paramViewGroup.kyp.setVisibility(0);
        paramViewGroup.kyp.setOnClickListener(CardNewMsgUI.this.iom);
        label447:
        localObject = localg.ajt();
        if ((localObject == null) || (TextUtils.isEmpty(((jh)localObject).text))) {
          break label700;
        }
        paramViewGroup.kys.setText(((jh)localObject).text);
        paramViewGroup.kyr.setVisibility(0);
        paramViewGroup.kyr.setOnClickListener(CardNewMsgUI.this.iom);
        paramViewGroup.kyr.setTag(localg);
        paramViewGroup.kyq.setVisibility(0);
      }
      for (;;)
      {
        localg.aju();
        localg.ajv();
        a(localg.koS, localg.koT, paramViewGroup, localg);
        GMTrace.o(4928206536704L, 36718);
        return paramView;
        paramViewGroup = (CardNewMsgUI.b)paramView.getTag();
        break;
        label570:
        w.d("MicroMsg.CardNewMsgUI", "CardNewMsgUI getView () position : " + paramInt + " field_logo_color :  " + localg.field_logo_color);
        paramViewGroup.kyk.setVisibility(0);
        paramViewGroup.kyj.setVisibility(8);
        if (!TextUtils.isEmpty(localg.field_logo_url))
        {
          m.a(CardNewMsgUI.this, paramViewGroup.kyl, localg.field_logo_url, i, R.g.aXk, l.uk(localg.field_logo_color));
          break label381;
        }
        m.a(paramViewGroup.kyl, R.g.aXk, l.uk(localg.field_logo_color));
        break label381;
        label688:
        paramViewGroup.kyp.setVisibility(8);
        break label447;
        label700:
        paramViewGroup.kyr.setVisibility(8);
        paramViewGroup.kyq.setVisibility(8);
      }
    }
  }
  
  private final class b
  {
    ImageView kyj;
    View kyk;
    ImageView kyl;
    TextView kym;
    TextView kyn;
    TextView kyo;
    TextView kyp;
    TextView kyq;
    View kyr;
    TextView kys;
    LinearLayout kyt;
    LinearLayout kyu;
    
    public b()
    {
      GMTrace.i(5009139826688L, 37321);
      GMTrace.o(5009139826688L, 37321);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardNewMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */