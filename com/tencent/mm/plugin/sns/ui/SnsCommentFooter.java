package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.k.b;
import com.tencent.mm.plugin.sns.i.a;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.d;
import com.tencent.mm.pluginsdk.ui.chat.e;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.protocal.c.bcz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.BasePanelKeybordLayout;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SnsCommentFooter
  extends BasePanelKeybordLayout
{
  private MMActivity fsU;
  private ImageButton nEi;
  MMEditText nEj;
  private Button nEk;
  ChatFooterPanel nEl;
  boolean nEm;
  public boolean nEn;
  private boolean nEo;
  boolean nEp;
  private TextWatcher nEq;
  ImageView qIJ;
  Button qIK;
  int qIL;
  public boolean qIM;
  private String qIN;
  private boolean qIO;
  a qIP;
  d qIQ;
  private bi qIR;
  bcz qbt;
  int state;
  
  public SnsCommentFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8420820254720L, 62740);
    this.qbt = null;
    this.qIL = 0;
    this.state = 0;
    this.nEm = false;
    this.nEn = false;
    this.nEo = true;
    this.qIN = "";
    this.qIO = false;
    this.nEp = true;
    this.nEq = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(8560272474112L, 63779);
        if (SnsCommentFooter.a(SnsCommentFooter.this).getText() == null)
        {
          GMTrace.o(8560272474112L, 63779);
          return;
        }
        SnsCommentFooter.a(SnsCommentFooter.this).requestFocus();
        if ((paramAnonymousEditable.length() > 0) && (paramAnonymousEditable.toString().trim().length() > 0)) {}
        for (int i = 1;; i = 0)
        {
          if ((i != 0) && (SnsCommentFooter.this.nEp))
          {
            SnsCommentFooter.a(SnsCommentFooter.this, true);
            SnsCommentFooter.this.nEp = false;
          }
          if (i == 0)
          {
            SnsCommentFooter.a(SnsCommentFooter.this, false);
            SnsCommentFooter.this.nEp = true;
          }
          GMTrace.o(8560272474112L, 63779);
          return;
        }
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(8560004038656L, 63777);
        GMTrace.o(8560004038656L, 63777);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(8560138256384L, 63778);
        GMTrace.o(8560138256384L, 63778);
      }
    };
    this.fsU = ((MMActivity)paramContext);
    GMTrace.o(8420820254720L, 62740);
  }
  
  private void act()
  {
    GMTrace.i(8421357125632L, 62744);
    this.nEl.onResume();
    this.nEl.setVisibility(0);
    ViewGroup.LayoutParams localLayoutParams = this.nEl.getLayoutParams();
    if ((localLayoutParams != null) && (j.aM(getContext())) && (this.nEo))
    {
      localLayoutParams.height = j.aK(getContext());
      this.nEl.setLayoutParams(localLayoutParams);
      this.nEo = false;
    }
    if (this.qIQ != null) {
      this.qIQ.onShow();
    }
    GMTrace.o(8421357125632L, 62744);
  }
  
  private void bmN()
  {
    GMTrace.i(14314454908928L, 106651);
    if (this.fsU.vov.vpj != 1) {
      this.fsU.aKp();
    }
    GMTrace.o(14314454908928L, 106651);
  }
  
  private void bmO()
  {
    GMTrace.i(14314589126656L, 106652);
    if (this.fsU.vov.vpj == 1) {
      this.fsU.aKl();
    }
    GMTrace.o(14314589126656L, 106652);
  }
  
  private void fQ(boolean paramBoolean)
  {
    GMTrace.i(8422967738368L, 62756);
    Animation localAnimation1 = AnimationUtils.loadAnimation(getContext(), i.a.aLP);
    Animation localAnimation2 = AnimationUtils.loadAnimation(getContext(), i.a.aLQ);
    localAnimation1.setDuration(150L);
    localAnimation2.setDuration(150L);
    if ((this.nEk == null) || (this.qIK == null))
    {
      GMTrace.o(8422967738368L, 62756);
      return;
    }
    if (paramBoolean)
    {
      if ((this.nEk.getVisibility() == 8) || (this.nEk.getVisibility() == 4))
      {
        GMTrace.o(8422967738368L, 62756);
        return;
      }
      this.qIK.startAnimation(localAnimation1);
      this.qIK.setVisibility(0);
      this.nEk.startAnimation(localAnimation2);
      this.nEk.setVisibility(8);
    }
    for (;;)
    {
      this.qIK.getParent().requestLayout();
      GMTrace.o(8422967738368L, 62756);
      return;
      if ((this.nEk.getVisibility() == 0) || (this.nEk.getVisibility() == 0))
      {
        GMTrace.o(8422967738368L, 62756);
        return;
      }
      this.nEk.startAnimation(localAnimation1);
      this.nEk.setVisibility(0);
      this.qIK.startAnimation(localAnimation2);
      this.qIK.setVisibility(8);
    }
  }
  
  public final void Il(String paramString)
  {
    GMTrace.i(8422162432000L, 62750);
    this.nEj.setHint(com.tencent.mm.pluginsdk.ui.d.h.b(getContext(), paramString, this.nEj.getTextSize()));
    GMTrace.o(8422162432000L, 62750);
  }
  
  public final void a(final c paramc)
  {
    GMTrace.i(8422430867456L, 62752);
    this.qIK.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8572217851904L, 63868);
        paramAnonymousView = c.d(SnsCommentFooter.a(SnsCommentFooter.this)).Dr(b.uc());
        paramAnonymousView.wNo = true;
        paramAnonymousView.a(new c.a()
        {
          public final void abH()
          {
            GMTrace.i(8674625978368L, 64631);
            com.tencent.mm.ui.base.h.h(SnsCommentFooter.l(SnsCommentFooter.this), i.j.pUl, i.j.pUm);
            GMTrace.o(8674625978368L, 64631);
          }
          
          public final void acg()
          {
            GMTrace.i(8674491760640L, 64630);
            GMTrace.o(8674491760640L, 64630);
          }
          
          public final void sy(String paramAnonymous2String)
          {
            GMTrace.i(8674357542912L, 64629);
            SnsCommentFooter.6.this.qIU.HZ(SnsCommentFooter.a(SnsCommentFooter.this).getText().toString());
            SnsCommentFooter.a(SnsCommentFooter.this).setText("");
            GMTrace.o(8674357542912L, 64629);
          }
        });
        GMTrace.o(8572217851904L, 63868);
      }
    });
    GMTrace.o(8422430867456L, 62752);
  }
  
  public final void a(String paramString, bcz parambcz)
  {
    GMTrace.i(8421759778816L, 62747);
    this.qIL = 0;
    if (!bg.mZ(paramString)) {
      this.nEj.setHint(com.tencent.mm.pluginsdk.ui.d.h.a(getContext(), paramString + this.fsU.getString(i.j.pRH, new Object[] { Float.valueOf(this.nEj.getTextSize()) })));
    }
    for (;;)
    {
      this.qbt = parambcz;
      GMTrace.o(8421759778816L, 62747);
      return;
      this.nEj.setHint("");
    }
  }
  
  public final void aLQ()
  {
    GMTrace.i(8422833520640L, 62755);
    this.qIR = null;
    if (this.nEl != null)
    {
      w.i("MicroMsg.SnsCommentFooter", "commentfooter release");
      this.nEl.oM();
      this.nEl.destroy();
    }
    GMTrace.o(8422833520640L, 62755);
  }
  
  protected final List<View> aLR()
  {
    GMTrace.i(16634139901952L, 123934);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.nEl);
    GMTrace.o(16634139901952L, 123934);
    return localArrayList;
  }
  
  public final void b(String paramString, bcz parambcz)
  {
    GMTrace.i(8421893996544L, 62748);
    if (!bg.mZ(paramString))
    {
      this.nEj.setHint(com.tencent.mm.pluginsdk.ui.d.h.a(getContext(), this.fsU.getString(i.j.pRz) + paramString + this.fsU.getString(i.j.pRH, new Object[] { Float.valueOf(this.nEj.getTextSize()) })));
      this.qIL = 1;
    }
    for (;;)
    {
      this.qbt = parambcz;
      GMTrace.o(8421893996544L, 62748);
      return;
      this.nEj.setHint("");
    }
  }
  
  public final boolean bmL()
  {
    GMTrace.i(8420686036992L, 62739);
    if ((this.nEj.getText() == null) || (bg.mZ(this.nEj.getText().toString())))
    {
      GMTrace.o(8420686036992L, 62739);
      return true;
    }
    GMTrace.o(8420686036992L, 62739);
    return false;
  }
  
  public final void bmM()
  {
    GMTrace.i(8420954472448L, 62741);
    ViewGroup localViewGroup = (ViewGroup)inflate(this.fsU, i.g.pOL, this);
    this.qIJ = ((ImageView)localViewGroup.findViewById(i.f.pMq));
    this.nEk = ((Button)localViewGroup.findViewById(i.f.pIu));
    this.qIK = ((Button)localViewGroup.findViewById(i.f.pIo));
    this.nEj = ((MMEditText)localViewGroup.findViewById(i.f.pIm));
    fQ(false);
    this.nEi = ((ImageButton)localViewGroup.findViewById(i.f.bhw));
    this.nEi.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8540274032640L, 63630);
        SnsCommentFooter.this.nEm = true;
        w.i("MicroMsg.SnsCommentFooter", "state onClick" + SnsCommentFooter.c(SnsCommentFooter.this));
        if (SnsCommentFooter.c(SnsCommentFooter.this) == 0)
        {
          SnsCommentFooter.d(SnsCommentFooter.this);
          SnsCommentFooter.a(SnsCommentFooter.this).requestFocus();
          SnsCommentFooter.a(SnsCommentFooter.this, 1);
          SnsCommentFooter.e(SnsCommentFooter.this);
          SnsCommentFooter.f(SnsCommentFooter.this).setImageResource(i.e.aXS);
          SnsCommentFooter.g(SnsCommentFooter.this);
          GMTrace.o(8540274032640L, 63630);
          return;
        }
        SnsCommentFooter.h(SnsCommentFooter.this);
        SnsCommentFooter.g(SnsCommentFooter.this);
        SnsCommentFooter.a(SnsCommentFooter.this).requestFocus();
        SnsCommentFooter.i(SnsCommentFooter.this);
        SnsCommentFooter.f(SnsCommentFooter.this).setImageResource(i.e.aXR);
        SnsCommentFooter.a(SnsCommentFooter.this, 0);
        GMTrace.o(8540274032640L, 63630);
      }
    });
    this.nEj.setHint(this.fsU.getString(i.j.pUh));
    this.nEj.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(8334249820160L, 62095);
        SnsCommentFooter.g(SnsCommentFooter.this);
        SnsCommentFooter.j(SnsCommentFooter.this).setVisibility(8);
        SnsCommentFooter.j(SnsCommentFooter.this).onPause();
        SnsCommentFooter.f(SnsCommentFooter.this).setImageResource(i.e.aXR);
        if (SnsCommentFooter.k(SnsCommentFooter.this) != null) {
          SnsCommentFooter.k(SnsCommentFooter.this).bmJ();
        }
        SnsCommentFooter.a(SnsCommentFooter.this, 0);
        GMTrace.o(8334249820160L, 62095);
        return false;
      }
    });
    if (e.tgc == null)
    {
      this.nEl = new d(this.fsU);
      GMTrace.o(8420954472448L, 62741);
      return;
    }
    this.nEl = e.tgc.ci(getContext());
    this.nEl.cU(ChatFooterPanel.SCENE_SNS);
    this.nEl.setVisibility(8);
    this.nEl.setBackgroundResource(i.e.aWJ);
    ((LinearLayout)findViewById(i.f.cse)).addView(this.nEl, -1, 0);
    this.nEl.oN();
    this.nEl.ar(false);
    this.nEl.sYp = new ChatFooterPanel.a()
    {
      public final void aLS()
      {
        GMTrace.i(8684960743424L, 64708);
        GMTrace.o(8684960743424L, 64708);
      }
      
      public final void acx()
      {
        GMTrace.i(8685229178880L, 64710);
        if (SnsCommentFooter.a(SnsCommentFooter.this) != null)
        {
          if (SnsCommentFooter.a(SnsCommentFooter.this).wTn == null)
          {
            GMTrace.o(8685229178880L, 64710);
            return;
          }
          SnsCommentFooter.a(SnsCommentFooter.this).wTn.sendKeyEvent(new KeyEvent(0, 67));
          SnsCommentFooter.a(SnsCommentFooter.this).wTn.sendKeyEvent(new KeyEvent(1, 67));
        }
        GMTrace.o(8685229178880L, 64710);
      }
      
      public final void append(String paramAnonymousString)
      {
        GMTrace.i(8685363396608L, 64711);
        try
        {
          SnsCommentFooter.a(SnsCommentFooter.this).Wn(paramAnonymousString);
          GMTrace.o(8685363396608L, 64711);
          return;
        }
        catch (Exception paramAnonymousString)
        {
          w.printErrStackTrace("MicroMsg.SnsCommentFooter", paramAnonymousString, "", new Object[0]);
          GMTrace.o(8685363396608L, 64711);
        }
      }
      
      public final void fR(boolean paramAnonymousBoolean)
      {
        GMTrace.i(8685094961152L, 64709);
        GMTrace.o(8685094961152L, 64709);
      }
    };
    GMTrace.o(8420954472448L, 62741);
  }
  
  public final boolean bmP()
  {
    GMTrace.i(14443169710080L, 107610);
    if (this.state == 1)
    {
      GMTrace.o(14443169710080L, 107610);
      return true;
    }
    GMTrace.o(14443169710080L, 107610);
    return false;
  }
  
  public final void bmQ()
  {
    GMTrace.i(8421491343360L, 62745);
    if (this.nEj == null)
    {
      w.e("MicroMsg.SnsCommentFooter", "send edittext is null");
      GMTrace.o(8421491343360L, 62745);
      return;
    }
    this.nEj.removeTextChangedListener(this.nEq);
    this.nEj.addTextChangedListener(this.nEq);
    GMTrace.o(8421491343360L, 62745);
  }
  
  public final void bmR()
  {
    GMTrace.i(8422028214272L, 62749);
    this.nEj.setText("");
    this.nEj.setHint("");
    this.qbt = null;
    this.qIL = 0;
    this.state = 0;
    GMTrace.o(8422028214272L, 62749);
  }
  
  public final bcz bmS()
  {
    GMTrace.i(8422296649728L, 62751);
    if (this.qbt == null)
    {
      localbcz = new bcz();
      GMTrace.o(8422296649728L, 62751);
      return localbcz;
    }
    bcz localbcz = this.qbt;
    GMTrace.o(8422296649728L, 62751);
    return localbcz;
  }
  
  public final void bmT()
  {
    GMTrace.i(8422565085184L, 62753);
    this.qIJ.setVisibility(8);
    GMTrace.o(8422565085184L, 62753);
  }
  
  public final void h(final List<l> paramList, String paramString)
  {
    GMTrace.i(8421625561088L, 62746);
    this.qIN = paramString;
    l locall;
    if (this.nEj != null)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        locall = (l)localIterator.next();
        if (paramString.equals(locall.amo)) {
          paramList.remove(locall);
        }
      }
    }
    for (paramString = bg.ap(locall.text, "");; paramString = "")
    {
      if (!bg.mZ(paramString))
      {
        this.qIK.setVisibility(0);
        this.nEk.setVisibility(8);
        this.nEj.setText("");
        this.nEj.Wn(paramString);
      }
      for (;;)
      {
        if (!this.qIO) {
          this.nEj.addTextChangedListener(new TextWatcher()
          {
            public final void afterTextChanged(Editable paramAnonymousEditable)
            {
              GMTrace.i(8545508524032L, 63669);
              if (SnsCommentFooter.a(SnsCommentFooter.this).getText() == null)
              {
                GMTrace.o(8545508524032L, 63669);
                return;
              }
              w.d("MicroMsg.SnsCommentFooter", "update commentkey:" + SnsCommentFooter.b(SnsCommentFooter.this));
              Object localObject = paramList.iterator();
              while (((Iterator)localObject).hasNext())
              {
                l locall = (l)((Iterator)localObject).next();
                if (SnsCommentFooter.b(SnsCommentFooter.this).equals(locall.amo))
                {
                  w.d("MicroMsg.SnsCommentFooter", "afterTextChanged update");
                  locall.text = SnsCommentFooter.a(SnsCommentFooter.this).getText().toString();
                }
              }
              for (int i = 1;; i = 0)
              {
                if (i == 0)
                {
                  w.d("MicroMsg.SnsCommentFooter", "afterTextChanged add");
                  localObject = new l();
                  ((l)localObject).amo = SnsCommentFooter.b(SnsCommentFooter.this);
                  ((l)localObject).text = SnsCommentFooter.a(SnsCommentFooter.this).getText().toString();
                  if ((((l)localObject).text != null) && (((l)localObject).text.length() > 0)) {
                    paramList.add(localObject);
                  }
                }
                if (paramList.size() > 5)
                {
                  w.d("MicroMsg.SnsCommentFooter", "comments remove");
                  paramList.remove(0);
                }
                SnsCommentFooter.a(SnsCommentFooter.this).requestFocus();
                if ((paramAnonymousEditable.length() > 0) && (paramAnonymousEditable.toString().trim().length() > 0)) {}
                for (boolean bool = true;; bool = false)
                {
                  if ((bool) && (SnsCommentFooter.this.nEp))
                  {
                    SnsCommentFooter.a(SnsCommentFooter.this, bool);
                    SnsCommentFooter.this.nEp = false;
                  }
                  if (!bool)
                  {
                    SnsCommentFooter.a(SnsCommentFooter.this, bool);
                    SnsCommentFooter.this.nEp = true;
                  }
                  GMTrace.o(8545508524032L, 63669);
                  return;
                }
              }
            }
            
            public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
            {
              GMTrace.i(8545374306304L, 63668);
              GMTrace.o(8545374306304L, 63668);
            }
            
            public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
            {
              GMTrace.i(8545240088576L, 63667);
              GMTrace.o(8545240088576L, 63667);
            }
          });
        }
        this.qIO = true;
        GMTrace.o(8421625561088L, 62746);
        return;
        this.nEj.setText("");
      }
    }
  }
  
  public final void ia(boolean paramBoolean)
  {
    GMTrace.i(8421222907904L, 62743);
    if (this.nEl == null)
    {
      GMTrace.o(8421222907904L, 62743);
      return;
    }
    this.qIM = paramBoolean;
    w.i("MicroMsg.SnsCommentFooter", "showState " + paramBoolean);
    if (!paramBoolean)
    {
      this.nEl.setVisibility(8);
      this.nEi.setImageResource(i.i.drb);
      bmO();
      requestLayout();
      GMTrace.o(8421222907904L, 62743);
      return;
    }
    if (this.state == 0)
    {
      bmN();
      this.nEj.requestFocus();
      this.nEl.setVisibility(8);
    }
    for (;;)
    {
      this.nEo = false;
      GMTrace.o(8421222907904L, 62743);
      return;
      bmO();
      this.nEj.requestFocus();
      act();
    }
  }
  
  protected final void ou(int paramInt)
  {
    GMTrace.i(8422699302912L, 62754);
    super.ou(paramInt);
    switch (paramInt)
    {
    default: 
      this.nEn = false;
    }
    do
    {
      GMTrace.o(8422699302912L, 62754);
      return;
      this.nEn = true;
    } while ((getVisibility() != 0) || (this.qIR == null));
    w.d("MicroMsg.SnsCommentFooter", "jacks dynamic adjust animation up");
    this.qIR.bnY();
    GMTrace.o(8422699302912L, 62754);
  }
  
  public void setVisibility(int paramInt)
  {
    boolean bool = false;
    GMTrace.i(8421088690176L, 62742);
    this.state = 0;
    if (paramInt == 0) {
      bool = true;
    }
    ia(bool);
    super.setVisibility(paramInt);
    GMTrace.o(8421088690176L, 62742);
  }
  
  static abstract interface a
  {
    public abstract void bmJ();
  }
  
  static abstract interface b
  {
    public abstract void bmK();
  }
  
  static abstract interface c
  {
    public abstract void HZ(String paramString);
  }
  
  static abstract interface d
  {
    public abstract void onShow();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsCommentFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */