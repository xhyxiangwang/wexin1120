package com.tencent.mm.ui.fts.widget;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.u.a.e;
import com.tencent.mm.u.a.g;
import com.tencent.mm.u.a.h;
import com.tencent.mm.ui.f.c.b;
import com.tencent.mm.ui.tools.a.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FTSEditTextView
  extends LinearLayout
{
  public ImageView jjR;
  public List<a.b> qOG;
  private String tih;
  protected View.OnFocusChangeListener vFI;
  public EditText vNy;
  public View wFW;
  private TextView wFX;
  private TextView wFY;
  private TextView wFZ;
  private View wGa;
  public boolean wGb;
  private View.OnClickListener wGc;
  public a wGd;
  private b wGe;
  
  public FTSEditTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(16798422401024L, 125158);
    this.wGb = true;
    this.wGc = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16803656892416L, 125197);
        int i = -1;
        if (paramAnonymousView.getId() == a.g.gWy) {
          i = 0;
        }
        for (;;)
        {
          if ((FTSEditTextView.g(FTSEditTextView.this) != null) && (i >= 0))
          {
            paramAnonymousView = FTSEditTextView.g(FTSEditTextView.this);
            FTSEditTextView.b(FTSEditTextView.this).get(i);
            paramAnonymousView.bbZ();
          }
          GMTrace.o(16803656892416L, 125197);
          return;
          if (paramAnonymousView.getId() == a.g.gWz) {
            i = 1;
          } else if (paramAnonymousView.getId() == a.g.gWA) {
            i = 2;
          }
        }
      }
    };
    this.wGe = b.wGg;
    this.vFI = new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(16804462198784L, 125203);
        if (FTSEditTextView.g(FTSEditTextView.this) != null) {
          FTSEditTextView.g(FTSEditTextView.this).hc(paramAnonymousBoolean);
        }
        GMTrace.o(16804462198784L, 125203);
      }
    };
    init();
    GMTrace.o(16798422401024L, 125158);
  }
  
  public FTSEditTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(16798556618752L, 125159);
    this.wGb = true;
    this.wGc = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16803656892416L, 125197);
        int i = -1;
        if (paramAnonymousView.getId() == a.g.gWy) {
          i = 0;
        }
        for (;;)
        {
          if ((FTSEditTextView.g(FTSEditTextView.this) != null) && (i >= 0))
          {
            paramAnonymousView = FTSEditTextView.g(FTSEditTextView.this);
            FTSEditTextView.b(FTSEditTextView.this).get(i);
            paramAnonymousView.bbZ();
          }
          GMTrace.o(16803656892416L, 125197);
          return;
          if (paramAnonymousView.getId() == a.g.gWz) {
            i = 1;
          } else if (paramAnonymousView.getId() == a.g.gWA) {
            i = 2;
          }
        }
      }
    };
    this.wGe = b.wGg;
    this.vFI = new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(16804462198784L, 125203);
        if (FTSEditTextView.g(FTSEditTextView.this) != null) {
          FTSEditTextView.g(FTSEditTextView.this).hc(paramAnonymousBoolean);
        }
        GMTrace.o(16804462198784L, 125203);
      }
    };
    init();
    GMTrace.o(16798556618752L, 125159);
  }
  
  private void ceA()
  {
    GMTrace.i(16799630360576L, 125167);
    w.i("MicroMsg.FTS.FTSEditTextView", "updateTagView %s", new Object[] { Integer.valueOf(this.qOG.size()) });
    float f = a.U(getContext(), a.e.aSh);
    if (this.qOG.size() > 0)
    {
      this.wFX.setVisibility(0);
      this.wFX.setText(b.a(getContext(), ((a.b)this.qOG.get(0)).getTagName(), f));
      if (this.qOG.size() < 2) {
        break label228;
      }
      this.wFY.setVisibility(0);
      this.wFY.setText(b.a(getContext(), ((a.b)this.qOG.get(1)).getTagName(), f));
    }
    for (;;)
    {
      if (this.qOG.size() < 3) {
        break label240;
      }
      this.wFZ.setVisibility(0);
      this.wFZ.setText(b.a(getContext(), ((a.b)this.qOG.get(2)).getTagName(), f));
      GMTrace.o(16799630360576L, 125167);
      return;
      this.wFX.setVisibility(8);
      break;
      label228:
      this.wFY.setVisibility(8);
    }
    label240:
    this.wFZ.setVisibility(8);
    GMTrace.o(16799630360576L, 125167);
  }
  
  public final void Il(String paramString)
  {
    GMTrace.i(16799496142848L, 125166);
    this.vNy.setHint(paramString);
    this.tih = paramString;
    GMTrace.o(16799496142848L, 125166);
  }
  
  public final void a(String paramString, List<a.b> paramList, b paramb)
  {
    GMTrace.i(17923166961664L, 133538);
    this.qOG.clear();
    if (paramList != null) {
      this.qOG.addAll(paramList);
    }
    w.i("MicroMsg.FTS.FTSEditTextView", "setText: %s %d", new Object[] { paramString, Integer.valueOf(this.qOG.size()) });
    this.wGe = b.wGi;
    this.vNy.setText(paramString);
    Selection.setSelection(this.vNy.getText(), this.vNy.getText().length());
    ceA();
    this.wGe = paramb;
    GMTrace.o(17923166961664L, 133538);
  }
  
  public final String bCI()
  {
    GMTrace.i(16799898796032L, 125169);
    Object localObject = new StringBuffer();
    Iterator localIterator = this.qOG.iterator();
    while (localIterator.hasNext())
    {
      ((StringBuffer)localObject).append(((a.b)localIterator.next()).getTagName());
      ((StringBuffer)localObject).append(" ");
    }
    ((StringBuffer)localObject).append(this.vNy.getText().toString());
    localObject = ((StringBuffer)localObject).toString().trim();
    GMTrace.o(16799898796032L, 125169);
    return (String)localObject;
  }
  
  public final String bCK()
  {
    GMTrace.i(16799764578304L, 125168);
    String str = this.vNy.getText().toString().trim();
    GMTrace.o(16799764578304L, 125168);
    return str;
  }
  
  public final void ceB()
  {
    GMTrace.i(16800033013760L, 125170);
    this.jjR.setVisibility(0);
    GMTrace.o(16800033013760L, 125170);
  }
  
  public final void ceC()
  {
    GMTrace.i(16800167231488L, 125171);
    this.wFW.setVisibility(8);
    GMTrace.o(16800167231488L, 125171);
  }
  
  protected void cex()
  {
    GMTrace.i(16798690836480L, 125160);
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(a.h.gXq, this, true);
    GMTrace.o(16798690836480L, 125160);
  }
  
  public final void cey()
  {
    GMTrace.i(16799093489664L, 125163);
    postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16796811788288L, 125146);
        ((InputMethodManager)FTSEditTextView.this.getContext().getSystemService("input_method")).showSoftInput(FTSEditTextView.a(FTSEditTextView.this), 0);
        GMTrace.o(16796811788288L, 125146);
      }
    }, 128L);
    GMTrace.o(16799093489664L, 125163);
  }
  
  public final void cez()
  {
    GMTrace.i(16799361925120L, 125165);
    this.vNy.requestFocus();
    GMTrace.o(16799361925120L, 125165);
  }
  
  public final void clearText()
  {
    GMTrace.i(16798959271936L, 125162);
    this.wGe = b.wGh;
    if (this.wGb) {
      this.qOG.clear();
    }
    this.vNy.setText("");
    this.vNy.setHint(this.tih);
    this.wFW.setVisibility(8);
    ceA();
    this.wGe = b.wGg;
    GMTrace.o(16798959271936L, 125162);
  }
  
  protected void init()
  {
    GMTrace.i(16798825054208L, 125161);
    cex();
    this.wGa = findViewById(a.g.gWB);
    this.jjR = ((ImageView)findViewById(a.g.icon));
    this.vNy = ((EditText)findViewById(a.g.bDn));
    this.wFW = findViewById(a.g.bvk);
    this.wFX = ((TextView)findViewById(a.g.gWy));
    this.wFY = ((TextView)findViewById(a.g.gWz));
    this.wFZ = ((TextView)findViewById(a.g.gWA));
    this.qOG = new ArrayList();
    this.vNy.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(16802717368320L, 125190);
        if ((paramAnonymousKeyEvent.getAction() == 0) && (67 == paramAnonymousInt))
        {
          paramAnonymousInt = FTSEditTextView.a(FTSEditTextView.this).getSelectionStart();
          int i = FTSEditTextView.a(FTSEditTextView.this).getSelectionEnd();
          if ((paramAnonymousInt == 0) && (i == 0) && (FTSEditTextView.b(FTSEditTextView.this).size() > 0) && (FTSEditTextView.c(FTSEditTextView.this)))
          {
            FTSEditTextView.b(FTSEditTextView.this).remove(FTSEditTextView.b(FTSEditTextView.this).size() - 1);
            FTSEditTextView.d(FTSEditTextView.this);
            FTSEditTextView.e(FTSEditTextView.this);
          }
        }
        GMTrace.o(16802717368320L, 125190);
        return false;
      }
    });
    this.vNy.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(16804193763328L, 125201);
        GMTrace.o(16804193763328L, 125201);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(16803925327872L, 125199);
        GMTrace.o(16803925327872L, 125199);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(16804059545600L, 125200);
        if (FTSEditTextView.this.bCI().length() > 0) {
          FTSEditTextView.f(FTSEditTextView.this).setVisibility(0);
        }
        for (;;)
        {
          FTSEditTextView.e(FTSEditTextView.this);
          GMTrace.o(16804059545600L, 125200);
          return;
          FTSEditTextView.f(FTSEditTextView.this).setVisibility(8);
        }
      }
    });
    this.vNy.setOnFocusChangeListener(this.vFI);
    this.vNy.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(16795738046464L, 125138);
        if ((3 == paramAnonymousInt) && (FTSEditTextView.g(FTSEditTextView.this) != null))
        {
          boolean bool = FTSEditTextView.g(FTSEditTextView.this).aaj();
          GMTrace.o(16795738046464L, 125138);
          return bool;
        }
        GMTrace.o(16795738046464L, 125138);
        return false;
      }
    });
    this.wFX.setOnClickListener(this.wGc);
    this.wFY.setOnClickListener(this.wGc);
    this.wFZ.setOnClickListener(this.wGc);
    this.wFW.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16801240973312L, 125179);
        FTSEditTextView.this.clearText();
        if (FTSEditTextView.g(FTSEditTextView.this) != null) {
          FTSEditTextView.g(FTSEditTextView.this).bbV();
        }
        GMTrace.o(16801240973312L, 125179);
      }
    });
    c.d(this.vNy).Dr(100).a(null);
    GMTrace.o(16798825054208L, 125161);
  }
  
  public final void r(String paramString, List<a.b> paramList)
  {
    GMTrace.i(16799227707392L, 125164);
    a(paramString, paramList, b.wGg);
    GMTrace.o(16799227707392L, 125164);
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb);
    
    public abstract boolean aaj();
    
    public abstract void bbV();
    
    public abstract void bbZ();
    
    public abstract void hc(boolean paramBoolean);
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(16801777844224L, 125183);
      wGg = new b("UserInput", 0);
      wGh = new b("ClearText", 1);
      wGi = new b("SetText", 2);
      wGj = new b[] { wGg, wGh, wGi };
      GMTrace.o(16801777844224L, 125183);
    }
    
    private b()
    {
      GMTrace.i(16801643626496L, 125182);
      GMTrace.o(16801643626496L, 125182);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/fts/widget/FTSEditTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */