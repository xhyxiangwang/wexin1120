package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.boi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
{
  public MMActivity fsU;
  public String hgu;
  public TextView ijm;
  public a naL;
  private DialPad naM;
  public TextView naN;
  public EditText naO;
  public View naP;
  private ImageButton naQ;
  public View naR;
  public TextView naS;
  public TextView naT;
  private an naU;
  public String naV;
  public String naW;
  public String naX;
  public String naY;
  public LinkedList<boi> naZ;
  public long nba;
  public boolean nbb;
  private Runnable nbc;
  private af nbd;
  public boolean nbe;
  private TextWatcher nbf;
  public String nbg;
  
  public b(MMActivity paramMMActivity, EditText paramEditText, TextView paramTextView1, View paramView1, DialPad paramDialPad, ImageButton paramImageButton, TextView paramTextView2, View paramView2, TextView paramTextView3, TextView paramTextView4)
  {
    GMTrace.i(15068892758016L, 112272);
    this.naX = "";
    this.nba = 0L;
    this.nbb = false;
    this.nbc = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11719757791232L, 87319);
        if (System.currentTimeMillis() - b.this.nba >= 500L)
        {
          b.this.naY = a.ah(b.this.fsU, b.this.naW + b.this.naX);
          af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(11651038314496L, 86807);
              if ((this.nbi != null) && (this.nbi.uQF != -1L))
              {
                b.this.ijm.setText(this.nbi.field_systemAddressBookUsername);
                GMTrace.o(11651038314496L, 86807);
                return;
              }
              b.this.ijm.setText("");
              GMTrace.o(11651038314496L, 86807);
            }
          });
          GMTrace.o(11719757791232L, 87319);
          return;
        }
        af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(11678150295552L, 87009);
            b.this.ijm.setText("");
            b.this.naY = null;
            b.this.hgu = null;
            GMTrace.o(11678150295552L, 87009);
          }
        });
        GMTrace.o(11719757791232L, 87319);
      }
    };
    this.nbd = new af("IPCallDialQueryPhoneNumber");
    this.nbe = false;
    this.nbf = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(11727945072640L, 87380);
        paramAnonymousEditable = b.this.naN.getText().toString().replace("+", "");
        if ((paramAnonymousEditable.startsWith("0")) || (paramAnonymousEditable.startsWith("*")) || (paramAnonymousEditable.startsWith("#")))
        {
          b.this.naN.setText("+");
          b.this.naW = "+";
        }
        GMTrace.o(11727945072640L, 87380);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(11727676637184L, 87378);
        GMTrace.o(11727676637184L, 87378);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(11727810854912L, 87379);
        if (b.this.naR.getLayoutParams() != null)
        {
          paramAnonymousCharSequence = b.this.naN.getPaint();
          if ("+".equals(b.this.naN.getText().toString()))
          {
            paramAnonymousInt1 = (int)paramAnonymousCharSequence.measureText(b.this.naN.getText().toString());
            b.this.naP.setVisibility(8);
            b.this.naS.setVisibility(8);
            paramAnonymousCharSequence = (RelativeLayout.LayoutParams)b.this.naR.getLayoutParams();
            paramAnonymousCharSequence.width = paramAnonymousInt1;
            b.this.naR.setLayoutParams(paramAnonymousCharSequence);
          }
        }
        else
        {
          paramAnonymousCharSequence = b.this.naN.getText().toString().replace("+", "");
          if (!a.Ah(paramAnonymousCharSequence)) {
            break label368;
          }
          b.this.naS.setText(a.Ae(paramAnonymousCharSequence));
          if ((b.this.naZ == null) || (b.this.naZ.size() <= 0)) {
            break label391;
          }
          String str = a.Af(paramAnonymousCharSequence);
          Iterator localIterator = b.this.naZ.iterator();
          while (localIterator.hasNext())
          {
            boi localboi = (boi)localIterator.next();
            if ((localboi != null) && (localboi.huS.equals(str)))
            {
              paramAnonymousInt1 = 1;
              label257:
              if (paramAnonymousInt1 == 0) {
                break label396;
              }
              b.this.naT.setVisibility(0);
            }
          }
        }
        for (;;)
        {
          if (b.this.naL != null) {
            b.this.naL.zN(paramAnonymousCharSequence);
          }
          GMTrace.o(11727810854912L, 87379);
          return;
          paramAnonymousInt1 = (int)paramAnonymousCharSequence.measureText(b.this.naN.getText() + "+");
          b.this.naP.setVisibility(0);
          b.this.naS.setVisibility(0);
          break;
          paramAnonymousInt1 = 0;
          break label257;
          label368:
          b.this.naS.setText(b.this.fsU.getString(R.l.ehC));
          label391:
          paramAnonymousInt1 = 0;
          break label257;
          label396:
          b.this.naT.setVisibility(8);
        }
      }
    };
    this.nbg = "";
    this.fsU = paramMMActivity;
    this.naO = paramEditText;
    this.naN = paramTextView1;
    this.naP = paramView1;
    this.naM = paramDialPad;
    this.naQ = paramImageButton;
    this.ijm = paramTextView2;
    this.naR = paramView2;
    this.naS = paramTextView3;
    this.naT = paramTextView4;
    this.naU = new an();
    this.naW = com.tencent.mm.plugin.ipcall.b.c.aID();
    paramMMActivity = ab.getContext().getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputCountryName", "");
    if (!bg.mZ(paramMMActivity)) {}
    for (;;)
    {
      this.naV = paramMMActivity;
      this.naN.addTextChangedListener(this.nbf);
      this.naN.setText("+" + this.naW);
      this.naM.naK = new DialPad.a()
      {
        public final void zK(String paramAnonymousString)
        {
          GMTrace.i(11647414435840L, 86780);
          b.this.naX = b.this.naO.getText().toString();
          if (b.this.nbb)
          {
            b.this.naW += paramAnonymousString;
            b.this.naN.setText(b.this.naW);
            if ((a.Ah(b.this.naW.replace("+", ""))) || (b.this.naW.replace("+", "").length() >= 4))
            {
              g.paX.i(12061, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0) });
              b.this.nbb = false;
              b.this.naV = a.Ae(b.this.naW.replace("+", ""));
              b.this.naX = b.this.cz(b.this.naW.replace("+", ""), b.this.naX);
              b.this.bi(b.this.naX, -1);
              GMTrace.o(11647414435840L, 86780);
            }
          }
          else
          {
            String str = b.this.naN.getText().toString().replace("+", "");
            if (!b.this.nbe) {
              break label740;
            }
            StringBuffer localStringBuffer = new StringBuffer(b.this.naX);
            localStringBuffer.insert(b.this.naO.getSelectionStart(), paramAnonymousString);
            b.this.naX = localStringBuffer.toString();
            if (b.this.naX.equals("00"))
            {
              b.this.naN.setText("+");
              b.this.nbb = true;
              b.this.naW = "+";
              b.this.naX = "";
            }
            if (a.Ah(b.this.naW.replace("+", "") + b.this.naX))
            {
              b.this.naN.setText("+" + b.this.naW.replace("+", "") + b.this.naX);
              b.this.naV = a.Ae(b.this.naW.replace("+", ""));
              b.this.nbb = false;
              b.this.naW = (b.this.naW.replace("+", "") + b.this.naX);
              b.this.naX = "";
            }
            paramAnonymousString = b.this.naX;
            b.this.naX = b.this.cz(str, b.this.naX);
            if (!b.this.nbe) {
              break label882;
            }
            if (paramAnonymousString.length() >= b.this.naX.length()) {
              break label774;
            }
            b.this.bi(b.this.naX, b.this.naO.getSelectionEnd() + 2);
          }
          for (;;)
          {
            b.this.nba = System.currentTimeMillis();
            if ((b.this.naX.length() > a.nhU) && (!bg.mZ(b.this.naW + b.this.naX))) {
              b.this.aHZ();
            }
            GMTrace.o(11647414435840L, 86780);
            return;
            label740:
            b.this.naX += paramAnonymousString;
            break;
            label774:
            if (paramAnonymousString.length() == b.this.naX.length())
            {
              b.this.bi(b.this.naX, b.this.naO.getSelectionEnd() + 1);
            }
            else if (paramAnonymousString.length() > b.this.naX.length())
            {
              b.this.bi(b.this.naX, b.this.naO.getSelectionEnd() + 1 - (paramAnonymousString.length() - b.this.naX.length()));
              continue;
              label882:
              b.this.bi(b.this.naX, -1);
            }
          }
        }
        
        public final void zL(String paramAnonymousString)
        {
          GMTrace.i(11647548653568L, 86781);
          if (paramAnonymousString.equals("0"))
          {
            b.this.naN.setText("+");
            b.this.nbb = true;
            b.this.naW = "+";
          }
          GMTrace.o(11647548653568L, 86781);
        }
      };
      this.naP.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11629831913472L, 86649);
          paramAnonymousView = b.this.naO.getText().toString();
          if (bg.mZ(paramAnonymousView))
          {
            paramAnonymousView = b.this.naN.getText().toString();
            if (!bg.mZ(paramAnonymousView))
            {
              paramAnonymousView = paramAnonymousView.substring(0, paramAnonymousView.length() - 1);
              if ((!bg.mZ(paramAnonymousView)) && (!paramAnonymousView.equals("+")))
              {
                b.this.naN.setText(paramAnonymousView);
                b.this.naW = paramAnonymousView;
                GMTrace.o(11629831913472L, 86649);
                return;
              }
              b.this.naN.setText("+");
              b.this.naW = "+";
              b.this.nbb = true;
            }
            GMTrace.o(11629831913472L, 86649);
            return;
          }
          int i = b.this.naO.getSelectionStart();
          String str;
          if ((b.this.nbe) && (i - 1 >= 0))
          {
            paramAnonymousView = b.this.naO.getText();
            paramAnonymousView.delete(i - 1, i);
            paramAnonymousView = paramAnonymousView.toString();
            if (bg.mZ(paramAnonymousView)) {
              break label384;
            }
            str = b.this.naN.getText().toString().replace("+", "");
            if (!b.this.nbe) {
              break label349;
            }
            b.this.naX = b.this.cz(str, paramAnonymousView);
            int j = b.this.naX.length();
            int k = paramAnonymousView.length();
            b.this.bi(b.this.naX, j - k + (i - 1));
            label297:
            b.this.aHZ();
          }
          for (;;)
          {
            b.this.naY = "";
            b.this.ijm.setText("");
            GMTrace.o(11629831913472L, 86649);
            return;
            paramAnonymousView = paramAnonymousView.substring(0, paramAnonymousView.length() - 1);
            break;
            label349:
            b.this.naX = b.this.cz(str, paramAnonymousView);
            b.this.bi(b.this.naX, -1);
            break label297;
            label384:
            b.this.naX = "";
            b.this.bi("", -1);
          }
        }
      });
      this.naP.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          GMTrace.i(11632918921216L, 86672);
          if (b.this.nbb)
          {
            b.this.naW = "+";
            b.this.naN.setText(b.this.naW);
          }
          for (;;)
          {
            GMTrace.o(11632918921216L, 86672);
            return true;
            b.this.ijm.setText("");
            b.this.naX = "";
            b.this.bi("", -1);
          }
        }
      });
      this.naN.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11721502621696L, 87332);
          g.paX.i(12061, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0) });
          paramAnonymousView = b.this.naN.getText().toString().replace("+", "");
          Intent localIntent = new Intent(b.this.fsU, IPCallCountryCodeSelectUI.class);
          localIntent.putExtra("couttry_code", paramAnonymousView);
          localIntent.putExtra("CountryCodeUI_isShowCountryCode", true);
          b.this.fsU.startActivityForResult(localIntent, 100);
          b.this.fsU.overridePendingTransition(R.a.aLT, -1);
          GMTrace.o(11721502621696L, 87332);
        }
      });
      this.naQ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11727408201728L, 87376);
          b localb = b.this;
          localb.naW = localb.naN.getText().toString();
          localb.naX = localb.naO.getText().toString();
          if ((!bg.mZ(localb.naW)) && (!bg.mZ(localb.naX)))
          {
            localb.naW = localb.naN.getText().toString().replace("+", "");
            localb.naY = a.ah(localb.fsU, localb.naW + localb.naX);
            localb.hgu = a.aj(localb.fsU, localb.naY);
            paramAnonymousView = com.tencent.mm.plugin.ipcall.b.c.Ao(localb.naX);
            Object localObject = ab.getContext().getSharedPreferences("IPCall_LastInputPref", 0).edit();
            ((SharedPreferences.Editor)localObject).putString("IPCall_LastInputPhoneNumber", paramAnonymousView);
            ((SharedPreferences.Editor)localObject).apply();
            String str = localb.naN.getText().toString();
            localObject = localb.naV;
            if (!bg.mZ(str))
            {
              paramAnonymousView = (View)localObject;
              if (bg.mZ((String)localObject)) {
                paramAnonymousView = "";
              }
              localObject = ab.getContext().getSharedPreferences("IPCall_LastInputPref", 0).edit();
              ((SharedPreferences.Editor)localObject).putString("IPCall_LastInputCountryCode", str.replace("+", ""));
              ((SharedPreferences.Editor)localObject).putString("IPCall_LastInputCountryName", paramAnonymousView);
              ((SharedPreferences.Editor)localObject).apply();
            }
            if (localb.naL != null)
            {
              localb.naL.g(localb.naW, com.tencent.mm.plugin.ipcall.b.c.Ao(localb.naX), localb.naY, localb.hgu);
              GMTrace.o(11727408201728L, 87376);
            }
          }
          else
          {
            paramAnonymousView = ab.getContext().getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputPhoneNumber", "");
            if (!bg.mZ(paramAnonymousView))
            {
              paramAnonymousView = com.tencent.mm.plugin.ipcall.b.c.Ao(paramAnonymousView);
              localb.naX = localb.cz(localb.naN.getText().toString().replace("+", ""), paramAnonymousView);
              localb.bi(localb.naX, -1);
              localb.aHZ();
            }
          }
          GMTrace.o(11727408201728L, 87376);
        }
      });
      this.naO.setHorizontallyScrolling(true);
      this.naO.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11648353959936L, 86787);
          b.this.naO.setCursorVisible(true);
          b.this.fsU.aKl();
          b.this.nbe = true;
          GMTrace.o(11648353959936L, 86787);
        }
      });
      this.naO.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(11626879123456L, 86627);
          GMTrace.o(11626879123456L, 86627);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(11626744905728L, 86626);
          GMTrace.o(11626744905728L, 86626);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(11626610688000L, 86625);
          String str = bg.Ao(paramAnonymousCharSequence.toString());
          if (str.contains(" "))
          {
            paramAnonymousCharSequence = str.replace(" ", "");
            b.this.naO.setText(bg.M(paramAnonymousCharSequence));
            if (!a.Ai(paramAnonymousCharSequence)) {
              break label220;
            }
            str = a.Ag(paramAnonymousCharSequence);
            if (!bg.mZ(str))
            {
              b.this.naN.setText("+" + str);
              b.this.naO.setText(a.Al(paramAnonymousCharSequence));
            }
          }
          for (;;)
          {
            if (b.this.naL != null) {
              b.this.naL.zO(b.this.naO.getText().toString());
            }
            GMTrace.o(11626610688000L, 86625);
            return;
            if (b.this.nbg.equals(str))
            {
              paramAnonymousCharSequence = str;
              if (paramAnonymousInt3 <= 0) {
                break;
              }
            }
            paramAnonymousCharSequence = str;
            if (!bg.mZ(str)) {
              break;
            }
            b.this.nbg = str;
            b.this.naO.setText("");
            paramAnonymousCharSequence = str;
            break;
            label220:
            if (!paramAnonymousCharSequence.equals(b.this.nbg))
            {
              b.this.nbg = paramAnonymousCharSequence;
              b.this.naO.setText(paramAnonymousCharSequence);
              if (bg.mZ(b.this.naN.getText().toString())) {
                b.this.naN.setText("+" + a.aIA());
              }
            }
          }
        }
      });
      if (com.tencent.mm.compatible.util.d.et(16))
      {
        this.naN.setTypeface(Typeface.create("sans-serif-light", 0));
        this.naO.setTypeface(Typeface.create("sans-serif-light", 0));
        this.ijm.setTypeface(Typeface.create("sans-serif-light", 0));
      }
      GMTrace.o(15068892758016L, 112272);
      return;
      paramMMActivity = a.Ae(a.aIA());
    }
  }
  
  public final void X(LinkedList<boi> paramLinkedList)
  {
    GMTrace.i(15069026975744L, 112273);
    this.naZ = paramLinkedList;
    paramLinkedList = this.naN.getText().toString().replace("+", "");
    if ((a.Ah(paramLinkedList)) && (this.naZ != null) && (this.naZ.size() > 0))
    {
      paramLinkedList = a.Af(paramLinkedList);
      Iterator localIterator = this.naZ.iterator();
      boi localboi;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localboi = (boi)localIterator.next();
      } while ((localboi == null) || (!localboi.huS.equals(paramLinkedList)));
    }
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        this.naT.setVisibility(0);
        GMTrace.o(15069026975744L, 112273);
        return;
      }
      this.naT.setVisibility(8);
      GMTrace.o(15069026975744L, 112273);
      return;
    }
  }
  
  public final void aHZ()
  {
    GMTrace.i(11633590009856L, 86677);
    this.nbd.bNo().removeCallbacks(this.nbc);
    this.nbd.h(this.nbc, 500L);
    GMTrace.o(11633590009856L, 86677);
  }
  
  public final void bi(String paramString, int paramInt)
  {
    GMTrace.i(11633455792128L, 86676);
    this.naO.setText(paramString);
    if (!bg.mZ(paramString))
    {
      if (paramInt == -1) {
        break label79;
      }
      if (this.nbe)
      {
        if ((paramInt <= 0) || (paramInt > this.naO.getText().length())) {
          break label79;
        }
        this.naO.setSelection(paramInt);
      }
    }
    for (;;)
    {
      this.naX = paramString;
      GMTrace.o(11633455792128L, 86676);
      return;
      label79:
      this.naO.setSelection(this.naO.getText().length());
    }
  }
  
  public final String cz(String paramString1, String paramString2)
  {
    GMTrace.i(11633321574400L, 86675);
    paramString1 = an.formatNumber(paramString1, com.tencent.mm.plugin.ipcall.b.c.Ao(paramString2));
    if (bg.mZ(paramString1))
    {
      GMTrace.o(11633321574400L, 86675);
      return paramString2;
    }
    GMTrace.o(11633321574400L, 86675);
    return paramString1;
  }
  
  public final void zM(String paramString)
  {
    GMTrace.i(11633187356672L, 86674);
    this.naW = paramString;
    if (this.naN != null) {
      this.naN.setText("+" + paramString);
    }
    GMTrace.o(11633187356672L, 86674);
  }
  
  public static abstract interface a
  {
    public abstract void g(String paramString1, String paramString2, String paramString3, String paramString4);
    
    public abstract void zN(String paramString);
    
    public abstract void zO(String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */