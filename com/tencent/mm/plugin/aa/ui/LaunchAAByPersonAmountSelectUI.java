package com.tencent.mm.plugin.aa.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.aa.a.c.c;
import com.tencent.mm.plugin.aa.a.c.c.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.x.n;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LaunchAAByPersonAmountSelectUI
  extends BaseAAPresenterActivity
{
  private String fvL;
  private ae ham;
  private long ijA;
  private int ijB;
  private boolean ijC;
  private boolean ijD;
  private Runnable ijE;
  private c ijq;
  private ListView ijr;
  private TextView ijs;
  private TextView ijt;
  private View iju;
  private TextView ijv;
  private boolean ijw;
  private Map<String, String> ijx;
  private a ijy;
  private double ijz;
  
  public LaunchAAByPersonAmountSelectUI()
  {
    GMTrace.i(5622783279104L, 41893);
    this.ijq = ((c)p(c.class));
    this.ijw = false;
    this.ijx = new HashMap();
    this.ijy = null;
    this.ijA = -1L;
    this.ijB = -1;
    this.ijD = false;
    this.ham = new ae(Looper.getMainLooper());
    this.ijE = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5632446955520L, 41965);
        LaunchAAByPersonAmountSelectUI.a(LaunchAAByPersonAmountSelectUI.this);
        LaunchAAByPersonAmountSelectUI.b(LaunchAAByPersonAmountSelectUI.this);
        GMTrace.o(5632446955520L, 41965);
      }
    };
    GMTrace.o(5622783279104L, 41893);
  }
  
  private void Qd()
  {
    GMTrace.i(5623185932288L, 41896);
    try
    {
      this.ijz = 0.0D;
      this.ijC = false;
      if (this.ijx == null) {
        break label273;
      }
      Iterator localIterator = this.ijx.values().iterator();
      while (localIterator.hasNext())
      {
        double d = bg.getDouble((String)localIterator.next(), 0.0D);
        this.ijz += d;
        if ((this.ijA > 0L) && (d * 100.0D > this.ijA)) {
          this.ijC = true;
        }
      }
      if (this.ijy == null) {
        break label273;
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.LaunchAAByPersonAmountSelectUI", "updateTotalAmount error: %s", new Object[] { localException.getMessage() });
      GMTrace.o(5623185932288L, 41896);
      return;
    }
    Object localObject2 = this.ijy;
    Object localObject1 = this.ijx;
    Object localObject3 = ((a)localObject2).dataList.iterator();
    while (((Iterator)localObject3).hasNext()) {
      ((b)((Iterator)localObject3).next()).ijM = "";
    }
    if ((localObject1 != null) && (((Map)localObject1).size() > 0))
    {
      localObject2 = ((a)localObject2).dataList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (b)((Iterator)localObject2).next();
        if (((Map)localObject1).containsKey(((b)localObject3).username)) {
          ((b)localObject3).ijM = ((String)((Map)localObject1).get(((b)localObject3).username));
        }
      }
    }
    label273:
    this.ijt.setText(getString(R.l.ejP, new Object[] { Double.valueOf(this.ijz) }));
    if (this.ijx.size() > 0) {
      aE(233, getString(R.l.dsc, new Object[] { Integer.valueOf(this.ijx.size()) }));
    }
    while (this.ijC)
    {
      g.paX.i(13722, new Object[] { Integer.valueOf(7) });
      W(233, false);
      localObject1 = getString(R.l.ejZ, new Object[] { Float.valueOf((float)this.ijA / 100.0F) });
      if (!bg.mZ((String)localObject1))
      {
        this.ijv.setText((CharSequence)localObject1);
        if (!this.ijv.isShown())
        {
          this.ijv.startAnimation(AnimationUtils.loadAnimation(this, R.a.aLI));
          this.ijv.setVisibility(0);
        }
      }
      GMTrace.o(5623185932288L, 41896);
      return;
      aE(233, getString(R.l.dwr));
    }
    W(233, true);
    if (this.ijv.isShown())
    {
      this.ijv.setText("");
      this.ijv.startAnimation(AnimationUtils.loadAnimation(this, R.a.aLM));
      this.ijv.setVisibility(8);
    }
    GMTrace.o(5623185932288L, 41896);
  }
  
  private void Qe()
  {
    GMTrace.i(5623320150016L, 41897);
    if (this.ijz > 0.0D)
    {
      this.ijw = true;
      this.ijs.setTextColor(getResources().getColor(R.e.aND));
      GMTrace.o(5623320150016L, 41897);
      return;
    }
    this.ijw = false;
    this.ijs.setTextColor(getResources().getColor(R.e.aNC));
    GMTrace.o(5623320150016L, 41897);
  }
  
  protected final int Qb()
  {
    GMTrace.i(5623051714560L, 41895);
    GMTrace.o(5623051714560L, 41895);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5623454367744L, 41898);
    int i = R.i.cYp;
    GMTrace.o(5623454367744L, 41898);
    return i;
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(5622917496832L, 41894);
    super.onCreate(paramBundle);
    oC(R.l.ejQ);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5646405599232L, 42069);
        if ((LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this) != null) && (LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this).size() > 0)) {
          com.tencent.mm.ui.base.h.a(LaunchAAByPersonAmountSelectUI.this, LaunchAAByPersonAmountSelectUI.this.getString(R.l.dsE), null, LaunchAAByPersonAmountSelectUI.this.getString(R.l.dsH), LaunchAAByPersonAmountSelectUI.this.getString(R.l.dsG), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(5626407157760L, 41920);
              LaunchAAByPersonAmountSelectUI.d(LaunchAAByPersonAmountSelectUI.this);
              GMTrace.o(5626407157760L, 41920);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(5621038448640L, 41880);
              LaunchAAByPersonAmountSelectUI.this.finish();
              GMTrace.o(5621038448640L, 41880);
            }
          });
        }
        for (;;)
        {
          GMTrace.o(5646405599232L, 42069);
          return true;
          LaunchAAByPersonAmountSelectUI.this.finish();
        }
      }
    });
    a(233, getString(R.l.dwr), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5651640090624L, 42108);
        if ((LaunchAAByPersonAmountSelectUI.e(LaunchAAByPersonAmountSelectUI.this) > 0) && (LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this) != null) && (LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this).size() > LaunchAAByPersonAmountSelectUI.e(LaunchAAByPersonAmountSelectUI.this)))
        {
          com.tencent.mm.ui.base.h.b(LaunchAAByPersonAmountSelectUI.this.vov.voR, LaunchAAByPersonAmountSelectUI.this.getString(R.l.ejR, new Object[] { Integer.valueOf(LaunchAAByPersonAmountSelectUI.e(LaunchAAByPersonAmountSelectUI.this)) }), "", true);
          g.paX.i(13722, new Object[] { Integer.valueOf(8) });
          GMTrace.o(5651640090624L, 42108);
          return true;
        }
        LaunchAAByPersonAmountSelectUI.d(LaunchAAByPersonAmountSelectUI.this);
        g.paX.i(13721, new Object[] { Integer.valueOf(3), Integer.valueOf(4) });
        GMTrace.o(5651640090624L, 42108);
        return true;
      }
    }, p.b.vpB);
    this.ijr = ((ListView)findViewById(R.h.bhQ));
    this.ijs = ((TextView)findViewById(R.h.bvj));
    this.ijt = ((TextView)findViewById(R.h.bhR));
    this.ijt.setText(getString(R.l.ejP, new Object[] { Float.valueOf(0.0F) }));
    this.iju = findViewById(R.h.czv);
    this.ijv = ((TextView)findViewById(R.h.bhE));
    this.ijd = this.ijr;
    this.iju.setVisibility(8);
    this.ijs.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(5616877699072L, 41849);
        if (!LaunchAAByPersonAmountSelectUI.k(LaunchAAByPersonAmountSelectUI.this))
        {
          GMTrace.o(5616877699072L, 41849);
          return true;
        }
        if ((paramAnonymousMotionEvent.getAction() == 0) || (paramAnonymousMotionEvent.getAction() == 2)) {
          LaunchAAByPersonAmountSelectUI.l(LaunchAAByPersonAmountSelectUI.this).setTextColor(LaunchAAByPersonAmountSelectUI.this.getResources().getColor(R.e.aNE));
        }
        for (;;)
        {
          GMTrace.o(5616877699072L, 41849);
          return false;
          if (LaunchAAByPersonAmountSelectUI.k(LaunchAAByPersonAmountSelectUI.this)) {
            LaunchAAByPersonAmountSelectUI.l(LaunchAAByPersonAmountSelectUI.this).setTextColor(LaunchAAByPersonAmountSelectUI.this.getResources().getColor(R.e.aND));
          } else {
            LaunchAAByPersonAmountSelectUI.l(LaunchAAByPersonAmountSelectUI.this).setTextColor(LaunchAAByPersonAmountSelectUI.this.getResources().getColor(R.e.aNC));
          }
        }
      }
    });
    this.ijs.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5632715390976L, 41967);
        if ((LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this) != null) && (LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this).size() > 0)) {}
        try
        {
          paramAnonymousView = new i.a(LaunchAAByPersonAmountSelectUI.this);
          paramAnonymousView.Bh(R.l.drV);
          paramAnonymousView.Bj(R.l.dwr).a(new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(5635802398720L, 41990);
              LaunchAAByPersonAmountSelectUI.m(LaunchAAByPersonAmountSelectUI.this);
              GMTrace.o(5635802398720L, 41990);
            }
          });
          paramAnonymousView.Bk(R.l.duP).b(new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(5605200756736L, 41762);
              g.paX.i(13721, new Object[] { Integer.valueOf(3), Integer.valueOf(10) });
              GMTrace.o(5605200756736L, 41762);
            }
          });
          paramAnonymousView.ZT().show();
          g.paX.i(13721, new Object[] { Integer.valueOf(3), Integer.valueOf(8) });
          GMTrace.o(5632715390976L, 41967);
          return;
        }
        catch (Exception paramAnonymousView)
        {
          for (;;)
          {
            w.e("MicroMsg.LaunchAAByPersonAmountSelectUI", "clear amount error");
          }
        }
      }
    });
    this.ijw = true;
    this.ijr.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(5644258115584L, 42053);
        GMTrace.o(5644258115584L, 42053);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(5644123897856L, 42052);
        if (paramAnonymousInt == 1) {
          LaunchAAByPersonAmountSelectUI.this.Qc();
        }
        GMTrace.o(5644123897856L, 42052);
      }
    });
    this.fvL = getIntent().getStringExtra("chatroom");
    this.ijA = getIntent().getLongExtra("maxPerAmount", -1L);
    this.ijB = getIntent().getIntExtra("maxUserNumber", -1);
    Object localObject = getIntent().getStringArrayListExtra("oldAmountData");
    w.i("MicroMsg.LaunchAAByPersonAmountSelectUI", "onCreate, chatroom: %s, maxPerAmount: %s, oldDataList: %s", new Object[] { this.fvL, Long.valueOf(this.ijA), localObject });
    this.ijx = new HashMap();
    paramBundle = new HashMap();
    if (localObject != null) {
      try
      {
        if (((ArrayList)localObject).size() > 0)
        {
          localObject = ((ArrayList)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            String[] arrayOfString = ((String)((Iterator)localObject).next()).split(",");
            if ((arrayOfString != null) && (arrayOfString.length == 2))
            {
              double d = bg.getDouble(arrayOfString[1], 0.0D);
              paramBundle.put(arrayOfString[0], Double.valueOf(d));
              this.ijx.put(arrayOfString[0], getString(R.l.drU, new Object[] { Double.valueOf(d) }));
            }
          }
        }
        this.ijq.C(c.a.class);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.LaunchAAByPersonAmountSelectUI", "onCreate parse old data error: %s", new Object[] { localException.getMessage() });
      }
    }
    this.ijq.a(c.a.class, new com.tencent.mm.vending.app.a.b() {});
    GMTrace.o(5622917496832L, 41894);
  }
  
  public void onDestroy()
  {
    GMTrace.i(5623588585472L, 41899);
    super.onDestroy();
    if (this.ijx != null) {
      this.ijx.clear();
    }
    GMTrace.o(5623588585472L, 41899);
  }
  
  private final class a
    extends BaseAdapter
  {
    List<LaunchAAByPersonAmountSelectUI.b> dataList;
    
    public a(Map<String, Double> paramMap)
    {
      GMTrace.i(5633923350528L, 41976);
      this.dataList = null;
      this.dataList = new ArrayList();
      paramMap = paramMap.iterator();
      if (paramMap.hasNext())
      {
        String str = (String)paramMap.next();
        LaunchAAByPersonAmountSelectUI.b localb = new LaunchAAByPersonAmountSelectUI.b(LaunchAAByPersonAmountSelectUI.this);
        localb.username = str;
        Object localObject;
        if ((localObject != null) && (((Map)localObject).containsKey(str))) {}
        for (localb.ijM = LaunchAAByPersonAmountSelectUI.this.getString(R.l.drU, new Object[] { ((Map)localObject).get(str) });; localb.ijM = "")
        {
          this.dataList.add(localb);
          break;
        }
      }
      GMTrace.o(5633923350528L, 41976);
    }
    
    private LaunchAAByPersonAmountSelectUI.b ht(int paramInt)
    {
      GMTrace.i(5634191785984L, 41978);
      LaunchAAByPersonAmountSelectUI.b localb = (LaunchAAByPersonAmountSelectUI.b)this.dataList.get(paramInt);
      GMTrace.o(5634191785984L, 41978);
      return localb;
    }
    
    public final int getCount()
    {
      GMTrace.i(5634057568256L, 41977);
      int i = this.dataList.size();
      GMTrace.o(5634057568256L, 41977);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(5634326003712L, 41979);
      long l = paramInt;
      GMTrace.o(5634326003712L, 41979);
      return l;
    }
    
    public final View getView(int paramInt, final View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(5634460221440L, 41980);
      LaunchAAByPersonAmountSelectUI.b localb = ht(paramInt);
      Object localObject = paramView;
      if (localb != null)
      {
        localObject = paramView;
        if (!bg.mZ(localb.username))
        {
          View localView = paramView;
          if (paramView == null)
          {
            localView = v.fa(LaunchAAByPersonAmountSelectUI.this).inflate(R.i.cYo, paramViewGroup, false);
            paramView = new a();
            paramView.iil = ((ImageView)localView.findViewById(R.h.bjn));
            paramView.ijm = ((TextView)localView.findViewById(R.h.cDK));
            paramView.ijn = ((WalletFormView)localView.findViewById(R.h.cdp));
            paramView.ijL = new LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this, localb.username);
            paramView.ijn.a(paramView.ijL);
            paramView.iil.setOnTouchListener(new View.OnTouchListener()
            {
              public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
              {
                GMTrace.i(5643855462400L, 42050);
                paramView.ijn.requestFocus();
                GMTrace.o(5643855462400L, 42050);
                return false;
              }
            });
            paramView.ijm.setOnTouchListener(new View.OnTouchListener()
            {
              public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
              {
                GMTrace.i(5639560495104L, 42018);
                paramView.ijn.requestFocus();
                GMTrace.o(5639560495104L, 42018);
                return false;
              }
            });
            localView.setTag(paramView);
            LaunchAAByPersonAmountSelectUI.this.a(paramView.ijn, 2, false, true);
          }
          paramView = (a)localView.getTag();
          if (!bg.mZ(localb.username))
          {
            paramView.ijL.username = localb.username;
            com.tencent.mm.pluginsdk.ui.a.b.a(paramView.iil, localb.username);
            paramView.ijm.setText(com.tencent.mm.pluginsdk.ui.d.h.b(LaunchAAByPersonAmountSelectUI.this.vov.voR, n.E(localb.username, LaunchAAByPersonAmountSelectUI.n(LaunchAAByPersonAmountSelectUI.this)), paramView.ijm.getTextSize()));
          }
          localObject = localView;
          if (localb.ijM != null)
          {
            localObject = localView;
            if (paramView.ijn.getText() != null)
            {
              localObject = localView;
              if (!localb.ijM.equals(paramView.ijn.getText().toLowerCase()))
              {
                paramViewGroup = paramView.ijn;
                localObject = paramView.ijL;
                if (paramViewGroup.xic != null) {
                  paramViewGroup.xic.removeTextChangedListener((TextWatcher)localObject);
                }
                paramView.ijn.setText(localb.ijM);
                paramView.ijn.a(paramView.ijL);
                localObject = localView;
              }
            }
          }
        }
      }
      GMTrace.o(5634460221440L, 41980);
      return (View)localObject;
    }
    
    private final class a
    {
      ImageView iil;
      LaunchAAByPersonAmountSelectUI.c ijL;
      TextView ijm;
      WalletFormView ijn;
      
      public a()
      {
        GMTrace.i(5650969001984L, 42103);
        GMTrace.o(5650969001984L, 42103);
      }
    }
  }
  
  private final class b
  {
    String ijM;
    String username;
    
    public b()
    {
      GMTrace.i(5609361506304L, 41793);
      this.username = null;
      this.ijM = null;
      GMTrace.o(5609361506304L, 41793);
    }
  }
  
  protected final class c
    implements TextWatcher
  {
    String username;
    
    public c(String paramString)
    {
      GMTrace.i(5633118044160L, 41970);
      this.username = paramString;
      GMTrace.o(5633118044160L, 41970);
    }
    
    public final void afterTextChanged(Editable paramEditable)
    {
      GMTrace.i(5633520697344L, 41973);
      try
      {
        if (paramEditable.toString().startsWith(".")) {
          paramEditable.insert(0, "0");
        }
        String str = paramEditable.toString();
        int i = str.indexOf(".");
        int j = str.length();
        if ((i >= 0) && (j - i > 2)) {
          paramEditable.delete(i + 3, j);
        }
        int k = str.lastIndexOf(".");
        if ((k != i) && (k > 0) && (j > k)) {
          paramEditable.delete(k, j);
        }
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
      if ((!bg.L(paramEditable)) && (bg.getDouble(paramEditable.toString(), 0.0D) > 0.0D)) {
        LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this).put(this.username, paramEditable.toString());
      }
      for (;;)
      {
        LaunchAAByPersonAmountSelectUI.j(LaunchAAByPersonAmountSelectUI.this).removeCallbacks(LaunchAAByPersonAmountSelectUI.i(LaunchAAByPersonAmountSelectUI.this));
        LaunchAAByPersonAmountSelectUI.j(LaunchAAByPersonAmountSelectUI.this).postDelayed(LaunchAAByPersonAmountSelectUI.i(LaunchAAByPersonAmountSelectUI.this), 50L);
        GMTrace.o(5633520697344L, 41973);
        return;
        LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this).remove(this.username);
      }
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(5633252261888L, 41971);
      GMTrace.o(5633252261888L, 41971);
    }
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(5633386479616L, 41972);
      GMTrace.o(5633386479616L, 41972);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */