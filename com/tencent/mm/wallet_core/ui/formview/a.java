package com.tencent.mm.wallet_core.ui.formview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.method.NumberKeyListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.sa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c.s;
import com.tencent.mm.wallet_core.ui.e;
import com.tenpay.android.wechat.TenpaySecureEditText;

public final class a
{
  public static String TAG;
  
  static
  {
    GMTrace.i(1488206168064L, 11088);
    TAG = "MicroMsg.CommonHintViewConfig";
    GMTrace.o(1488206168064L, 11088);
  }
  
  public static void a(final MMActivity paramMMActivity, WalletFormView paramWalletFormView)
  {
    GMTrace.i(1486595555328L, 11076);
    if (paramWalletFormView == null)
    {
      w.e(TAG, "hy: param error");
      GMTrace.o(1486595555328L, 11076);
      return;
    }
    paramWalletFormView.xif = new c()
    {
      public final boolean aYV()
      {
        GMTrace.i(1484179636224L, 11058);
        GMTrace.o(1484179636224L, 11058);
        return true;
      }
      
      public final String e(WalletFormView paramAnonymousWalletFormView, String paramAnonymousString)
      {
        GMTrace.i(1484313853952L, 11059);
        paramAnonymousWalletFormView = bg.ap((String)paramAnonymousWalletFormView.getTag(), "").replace("/", "");
        GMTrace.o(1484313853952L, 11059);
        return paramAnonymousWalletFormView;
      }
    };
    b.f(paramMMActivity, paramWalletFormView);
    paramWalletFormView.j(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1483911200768L, 11056);
        this.xhO.getContext();
        int i = s.ciW();
        this.xhO.getContext();
        int j = s.ciX();
        b.a(paramMMActivity, i, j);
        GMTrace.o(1483911200768L, 11056);
      }
    });
    GMTrace.o(1486595555328L, 11076);
  }
  
  public static void a(EditHintPasswdView paramEditHintPasswdView)
  {
    GMTrace.i(1486192902144L, 11073);
    if (paramEditHintPasswdView != null) {
      paramEditHintPasswdView.xhX = 1;
    }
    GMTrace.o(1486192902144L, 11073);
  }
  
  public static void a(EditHintPasswdView paramEditHintPasswdView, boolean paramBoolean)
  {
    GMTrace.i(1486327119872L, 11074);
    if (paramEditHintPasswdView != null) {
      if (!paramBoolean) {
        break label35;
      }
    }
    label35:
    for (int i = -10;; i = 20)
    {
      paramEditHintPasswdView.xhX = i;
      GMTrace.o(1486327119872L, 11074);
      return;
    }
  }
  
  public static void a(WalletFormView paramWalletFormView)
  {
    GMTrace.i(1486461337600L, 11075);
    if (paramWalletFormView == null)
    {
      w.e(TAG, "hy: param error");
      GMTrace.o(1486461337600L, 11075);
      return;
    }
    paramWalletFormView.xif = new c()
    {
      public final boolean aYV()
      {
        GMTrace.i(19127099981824L, 142508);
        GMTrace.o(19127099981824L, 142508);
        return true;
      }
      
      public final boolean c(WalletFormView paramAnonymousWalletFormView, String paramAnonymousString)
      {
        GMTrace.i(1490219433984L, 11103);
        if ((!bg.mZ(paramAnonymousString)) && (paramAnonymousString.length() <= 5))
        {
          paramAnonymousWalletFormView.setSelection(0);
          if (paramAnonymousWalletFormView.xic != null) {
            paramAnonymousWalletFormView.xic.setBankcardTailNum(paramAnonymousString);
          }
          paramAnonymousWalletFormView.oTp = (24 - paramAnonymousString.length());
          paramAnonymousWalletFormView.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramAnonymousWalletFormView.oTp) });
          GMTrace.o(1490219433984L, 11103);
          return true;
        }
        GMTrace.o(1490219433984L, 11103);
        return false;
      }
      
      public final boolean d(WalletFormView paramAnonymousWalletFormView, String paramAnonymousString)
      {
        GMTrace.i(1490353651712L, 11104);
        if ((!bg.mZ(paramAnonymousString)) && (paramAnonymousString.length() <= 5))
        {
          paramAnonymousWalletFormView.setSelection(0);
          if (paramAnonymousWalletFormView.xic != null) {
            paramAnonymousWalletFormView.xic.set3DesEncrptData(paramAnonymousString);
          }
          paramAnonymousWalletFormView.oTp = (24 - paramAnonymousString.length());
          paramAnonymousWalletFormView.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramAnonymousWalletFormView.oTp) });
          GMTrace.o(1490353651712L, 11104);
          return true;
        }
        GMTrace.o(1490353651712L, 11104);
        return false;
      }
      
      public final String e(WalletFormView paramAnonymousWalletFormView, String paramAnonymousString)
      {
        GMTrace.i(19127234199552L, 142509);
        paramAnonymousWalletFormView = bg.ap(paramAnonymousString, "").replaceAll(" ", "");
        GMTrace.o(19127234199552L, 142509);
        return paramAnonymousWalletFormView;
      }
      
      public final boolean h(WalletFormView paramAnonymousWalletFormView)
      {
        GMTrace.i(1490487869440L, 11105);
        if (paramAnonymousWalletFormView.xic == null)
        {
          GMTrace.o(1490487869440L, 11105);
          return false;
        }
        boolean bool = paramAnonymousWalletFormView.xic.isBankcardNum();
        GMTrace.o(1490487869440L, 11105);
        return bool;
      }
    };
    GMTrace.o(1486461337600L, 11075);
  }
  
  public static void b(final MMActivity paramMMActivity, WalletFormView paramWalletFormView)
  {
    GMTrace.i(1486729773056L, 11077);
    if (paramWalletFormView == null)
    {
      w.e(TAG, "hy: param error");
      GMTrace.o(1486729773056L, 11077);
      return;
    }
    paramWalletFormView.j(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1481763717120L, 11040);
        this.xhO.getContext();
        int i = s.ciY();
        int j = R.l.dPA;
        b.a(paramMMActivity, i, j);
        GMTrace.o(1481763717120L, 11040);
      }
    });
    GMTrace.o(1486729773056L, 11077);
  }
  
  public static void b(WalletFormView paramWalletFormView)
  {
    GMTrace.i(1486863990784L, 11078);
    if (paramWalletFormView == null)
    {
      w.e(TAG, "hy: param error");
      GMTrace.o(1486863990784L, 11078);
      return;
    }
    paramWalletFormView.xif = new a(1, paramWalletFormView);
    GMTrace.o(1486863990784L, 11078);
  }
  
  public static void c(MMActivity paramMMActivity, WalletFormView paramWalletFormView)
  {
    GMTrace.i(1487266643968L, 11081);
    if (paramWalletFormView == null)
    {
      w.e(TAG, "hy: param error");
      GMTrace.o(1487266643968L, 11081);
      return;
    }
    paramWalletFormView.j(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1496393449472L, 11149);
        int i = R.i.djd;
        int j = R.l.eTz;
        b.a(this.lpL, i, j);
        GMTrace.o(1496393449472L, 11149);
      }
    });
    paramWalletFormView.xif = new c()
    {
      public final boolean h(WalletFormView paramAnonymousWalletFormView)
      {
        GMTrace.i(1483508547584L, 11053);
        if (paramAnonymousWalletFormView.xic == null)
        {
          GMTrace.o(1483508547584L, 11053);
          return false;
        }
        boolean bool = paramAnonymousWalletFormView.xic.isPhoneNum();
        GMTrace.o(1483508547584L, 11053);
        return bool;
      }
    };
    GMTrace.o(1487266643968L, 11081);
  }
  
  public static void c(WalletFormView paramWalletFormView)
  {
    GMTrace.i(1486998208512L, 11079);
    if (paramWalletFormView == null)
    {
      w.e(TAG, "hy: param error");
      GMTrace.o(1486998208512L, 11079);
      return;
    }
    paramWalletFormView.xif = new a(paramWalletFormView);
    "\\x20\\t\\r\\n".toCharArray();
    GMTrace.o(1486998208512L, 11079);
  }
  
  public static void d(MMActivity paramMMActivity, WalletFormView paramWalletFormView)
  {
    GMTrace.i(1487400861696L, 11082);
    if (paramWalletFormView == null)
    {
      w.e(TAG, "hy: param error");
      GMTrace.o(1487400861696L, 11082);
      return;
    }
    paramWalletFormView.j(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1485521813504L, 11068);
        h.a(this.lpL, this.lpL.getString(R.l.eTw), this.lpL.getString(R.l.eTu), this.lpL.getString(R.l.eTv), this.lpL.getString(R.l.eTx), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(1500285763584L, 11178);
            e.m(a.10.this.lpL, "https://wx.tenpay.com/cgi-bin/mmpayweb-bin/payunregshow?operation=1", false);
            com.tencent.mm.sdk.b.a.uLm.m(new sa());
            GMTrace.o(1500285763584L, 11178);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(1484984942592L, 11064);
            paramAnonymous2DialogInterface.dismiss();
            GMTrace.o(1484984942592L, 11064);
          }
        });
        GMTrace.o(1485521813504L, 11068);
      }
    });
    "\\x20\\t\\r\\n".toCharArray();
    GMTrace.o(1487400861696L, 11082);
  }
  
  public static void d(WalletFormView paramWalletFormView)
  {
    GMTrace.i(1487132426240L, 11080);
    if (paramWalletFormView == null)
    {
      w.e(TAG, "hy: param error");
      GMTrace.o(1487132426240L, 11080);
      return;
    }
    paramWalletFormView.xif = new c()
    {
      public final boolean h(WalletFormView paramAnonymousWalletFormView)
      {
        GMTrace.i(1501762158592L, 11189);
        boolean bool = bg.Rq(paramAnonymousWalletFormView.getText());
        GMTrace.o(1501762158592L, 11189);
        return bool;
      }
    };
    GMTrace.o(1487132426240L, 11080);
  }
  
  public static void e(MMActivity paramMMActivity, WalletFormView paramWalletFormView)
  {
    GMTrace.i(1487535079424L, 11083);
    if (paramWalletFormView == null)
    {
      w.e(TAG, "hy: param error");
      GMTrace.o(1487535079424L, 11083);
      return;
    }
    paramWalletFormView.j(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1485253378048L, 11066);
        int i = R.i.diI;
        int j = R.l.eTu;
        b.a(this.lpL, i, j);
        GMTrace.o(1485253378048L, 11066);
      }
    });
    "\\x20\\t\\r\\n".toCharArray();
    GMTrace.o(1487535079424L, 11083);
  }
  
  public static void e(WalletFormView paramWalletFormView)
  {
    GMTrace.i(1487669297152L, 11084);
    if (paramWalletFormView == null)
    {
      w.e(TAG, "hy: param error");
      GMTrace.o(1487669297152L, 11084);
      return;
    }
    paramWalletFormView.xif = new c()
    {
      public final boolean h(WalletFormView paramAnonymousWalletFormView)
      {
        GMTrace.i(1497467191296L, 11157);
        if (paramAnonymousWalletFormView.xic == null)
        {
          GMTrace.o(1497467191296L, 11157);
          return false;
        }
        boolean bool = paramAnonymousWalletFormView.xic.isMoneyAmount();
        GMTrace.o(1497467191296L, 11157);
        return bool;
      }
    };
    GMTrace.o(1487669297152L, 11084);
  }
  
  public static void f(WalletFormView paramWalletFormView)
  {
    GMTrace.i(1487803514880L, 11085);
    if (paramWalletFormView == null)
    {
      w.e(TAG, "hy: param error");
      GMTrace.o(1487803514880L, 11085);
      return;
    }
    if (paramWalletFormView.xic != null) {
      paramWalletFormView.xic.setIsSecurityAnswerFormat(true);
    }
    GMTrace.o(1487803514880L, 11085);
  }
  
  public static void g(WalletFormView paramWalletFormView)
  {
    GMTrace.i(1487937732608L, 11086);
    if (paramWalletFormView == null)
    {
      w.e(TAG, "hy: param error");
      GMTrace.o(1487937732608L, 11086);
      return;
    }
    paramWalletFormView.xie = new b()
    {
      public final boolean a(WalletFormView paramAnonymousWalletFormView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(1499883110400L, 11175);
        if ((this.xhO.b(this.xhO.oSV, paramAnonymousMotionEvent)) && (paramAnonymousMotionEvent.getAction() == 1))
        {
          w.d(a.TAG, "hy: click on info iv");
          this.xhO.performClick();
          GMTrace.o(1499883110400L, 11175);
          return true;
        }
        boolean bool = super.a(paramAnonymousWalletFormView, paramAnonymousMotionEvent);
        GMTrace.o(1499883110400L, 11175);
        return bool;
      }
    };
    GMTrace.o(1487937732608L, 11086);
  }
  
  public static final class a
    extends a.c
  {
    private int xhQ;
    private WalletFormView xhR;
    
    public a(int paramInt, WalletFormView paramWalletFormView)
    {
      GMTrace.i(1482032152576L, 11042);
      this.xhQ = 1;
      this.xhR = paramWalletFormView;
      this.xhQ = 1;
      cjs();
      GMTrace.o(1482032152576L, 11042);
    }
    
    public a(WalletFormView paramWalletFormView)
    {
      this(1, paramWalletFormView);
      GMTrace.i(1481897934848L, 11041);
      GMTrace.o(1481897934848L, 11041);
    }
    
    private void cjs()
    {
      GMTrace.i(1482300588032L, 11044);
      if (this.xhQ == 1)
      {
        if (this.xhR != null)
        {
          this.xhR.setKeyListener(new NumberKeyListener()
          {
            protected final char[] getAcceptedChars()
            {
              GMTrace.i(1497198755840L, 11155);
              GMTrace.o(1497198755840L, 11155);
              return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 120, 88 };
            }
            
            public final int getInputType()
            {
              GMTrace.i(1497064538112L, 11154);
              GMTrace.o(1497064538112L, 11154);
              return 1;
            }
          });
          GMTrace.o(1482300588032L, 11044);
        }
      }
      else if (this.xhR != null) {
        this.xhR.setInputType(1);
      }
      GMTrace.o(1482300588032L, 11044);
    }
    
    public final void Ei(int paramInt)
    {
      GMTrace.i(1482166370304L, 11043);
      this.xhQ = paramInt;
      cjs();
      GMTrace.o(1482166370304L, 11043);
    }
    
    public final boolean h(WalletFormView paramWalletFormView)
    {
      GMTrace.i(1482434805760L, 11045);
      int i = this.xhQ;
      if (paramWalletFormView.xic == null)
      {
        GMTrace.o(1482434805760L, 11045);
        return false;
      }
      boolean bool = paramWalletFormView.xic.isAreaIDCardNum(i);
      GMTrace.o(1482434805760L, 11045);
      return bool;
    }
  }
  
  private static class b
    implements com.tencent.mm.wallet_core.ui.formview.a.a
  {
    public b()
    {
      GMTrace.i(1490622087168L, 11106);
      GMTrace.o(1490622087168L, 11106);
    }
    
    public boolean a(WalletFormView paramWalletFormView, MotionEvent paramMotionEvent)
    {
      GMTrace.i(1490890522624L, 11108);
      GMTrace.o(1490890522624L, 11108);
      return false;
    }
    
    public final void buT()
    {
      GMTrace.i(1490756304896L, 11107);
      GMTrace.o(1490756304896L, 11107);
    }
  }
  
  private static class c
    implements com.tencent.mm.wallet_core.ui.formview.a.b
  {
    public c()
    {
      GMTrace.i(1502433247232L, 11194);
      GMTrace.o(1502433247232L, 11194);
    }
    
    public boolean aYV()
    {
      GMTrace.i(1502970118144L, 11198);
      GMTrace.o(1502970118144L, 11198);
      return false;
    }
    
    public boolean c(WalletFormView paramWalletFormView, String paramString)
    {
      GMTrace.i(1502701682688L, 11196);
      GMTrace.o(1502701682688L, 11196);
      return false;
    }
    
    public boolean d(WalletFormView paramWalletFormView, String paramString)
    {
      GMTrace.i(1502835900416L, 11197);
      GMTrace.o(1502835900416L, 11197);
      return false;
    }
    
    public String e(WalletFormView paramWalletFormView, String paramString)
    {
      GMTrace.i(1503104335872L, 11199);
      GMTrace.o(1503104335872L, 11199);
      return null;
    }
    
    public boolean h(WalletFormView paramWalletFormView)
    {
      GMTrace.i(1502567464960L, 11195);
      GMTrace.o(1502567464960L, 11195);
      return true;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/ui/formview/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */