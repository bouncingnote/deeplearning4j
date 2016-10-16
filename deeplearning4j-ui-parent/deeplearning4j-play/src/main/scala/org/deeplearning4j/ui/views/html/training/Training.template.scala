
package org.deeplearning4j.ui.views.html.training

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Training_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class Training extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[org.deeplearning4j.ui.api.I18N,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(i18n: org.deeplearning4j.ui.api.I18N):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""
"""),format.raw/*2.1*/("""<html>
    <head>
        <link rel="stylesheet" type="text/css" href="assets/css/train.css"/><meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <title>"""),_display_(/*5.17*/i18n/*5.21*/.getMessage("train.pagetitle")),format.raw/*5.51*/("""</title>
            <!-- jQuery, D3.js, etc -->
        <script src="/assets/jquery-2.2.0.min.js"></script>
        <script src="/assets/notify.js"></script>
            <!-- Custom assets compiled from Typescript -->
        <script src="/assets/js/dl4j-play-ui.js"></script>
    </head>
    <script>
        function onPageLoad()"""),format.raw/*13.30*/("""{"""),format.raw/*13.31*/("""
            """),format.raw/*14.13*/("""onNavClick('overview', '"""),_display_(/*14.38*/i18n/*14.42*/.getMessage("train.nav.errormsg")),format.raw/*14.75*/("""');
            setLanguageSelectorValue();
            setInterval(getAndProcessUpdate,2000);
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/("""
    """),format.raw/*18.5*/("""</script>
    <body onload="onPageLoad()">

        <div class="outerDiv">
            <div class="topBarDiv">
                <div class="topBarDivContent"><a href="/"><img src="/assets/deeplearning4j.img" border="0"/></a></div>
                <div class="topBarDivContent">Deeplearning4j UI</div>
            </div>

            <div class="navDiv">
                <div class="navTopSpacer"></div>
                <div class="navSessionID">
                    <strong>"""),_display_(/*30.30*/i18n/*30.34*/.getMessage("train.nav.sessionid")),format.raw/*30.68*/(""":</strong><br>
                    TODO<br>
                </div>
                <div class="navTopSpacer"></div>
                <div class="navElement" id="overviewNavDiv" onclick="onNavClick('overview', '"""),_display_(/*34.95*/i18n/*34.99*/.getMessage("train.nav.errormsg")),format.raw/*34.132*/("""')">
                    <div class="navHorizontalSpacer"></div>
                    <img src="assets/img/train/nav_icon_home_28.png">
                    <div class="navHorizontalSpacer"></div>
                    """),_display_(/*38.22*/i18n/*38.26*/.getMessage("train.nav.overview")),format.raw/*38.59*/("""
                """),format.raw/*39.17*/("""</div>
                <div class="navElementSpacer"></div>
                <div class="navElement" id="modelNavDiv" onclick="onNavClick('model', '"""),_display_(/*41.89*/i18n/*41.93*/.getMessage("train.nav.errormsg")),format.raw/*41.126*/("""')">
                    <div class="navHorizontalSpacer"></div>
                    <img src="assets/img/train/nav_icon_model_28.png">
                    <div class="navHorizontalSpacer"></div>
                    """),_display_(/*45.22*/i18n/*45.26*/.getMessage("train.nav.model")),format.raw/*45.56*/("""
                """),format.raw/*46.17*/("""</div>
                <div class="navElementSpacer"></div>
                <div class="navElement" id="systemNavDiv" onclick="onNavClick('system', '"""),_display_(/*48.91*/i18n/*48.95*/.getMessage("train.nav.errormsg")),format.raw/*48.128*/("""')">
                    <div class="navHorizontalSpacer"></div>
                    <img src="assets/img/train/nav_icon_system_28.png">
                    <div class="navHorizontalSpacer"></div>
                    """),_display_(/*52.22*/i18n/*52.26*/.getMessage("train.nav.hwsw")),format.raw/*52.55*/("""
                """),format.raw/*53.17*/("""</div>
                <div class="navElementSpacer"></div>
                <div class="navElement" id="helpNavDiv" onclick="onNavClick('help', '"""),_display_(/*55.87*/i18n/*55.91*/.getMessage("train.nav.errormsg")),format.raw/*55.124*/("""')">
                    <div class="navHorizontalSpacer"></div>
                    <img src="assets/img/train/nav_icon_help_28.png">
                    <div class="navHorizontalSpacer"></div>
                    """),_display_(/*59.22*/i18n/*59.26*/.getMessage("train.nav.help")),format.raw/*59.55*/("""
                """),format.raw/*60.17*/("""</div>
                <div class="navBottom">
                    """),_display_(/*62.22*/i18n/*62.26*/.getMessage("train.nav.language")),format.raw/*62.59*/(""":
                    <select class="languageSelect" id="navLangSelect" onchange="changeLanguage('"""),_display_(/*63.98*/i18n/*63.102*/.getMessage("train.nav.langChangeErrorMsg")),format.raw/*63.145*/("""')">
                        <option value="en">English</option>
                        <option value="ja">日本語</option>
                        <option value="zh">中文</option>
                        <option value="kr">한글</option>
                    </select>
                    <div class="navElementSpacer"></div>
                    <a href=""""),_display_(/*70.31*/i18n/*70.35*/.getMessage("train.nav.websitelink")),format.raw/*70.71*/("""" class="textlink">"""),_display_(/*70.91*/i18n/*70.95*/.getMessage("train.nav.websitelinktext")),format.raw/*70.135*/("""</a>
                    <div class="navElementSpacer"></div>
                </div>
            </div>


            <div class="contentDiv" id="mainContentDiv">

            </div>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(i18n:org.deeplearning4j.ui.api.I18N): play.twirl.api.HtmlFormat.Appendable = apply(i18n)

  def f:((org.deeplearning4j.ui.api.I18N) => play.twirl.api.HtmlFormat.Appendable) = (i18n) => apply(i18n)

  def ref: this.type = this

}


}

/**/
object Training extends Training_Scope0.Training
              /*
                  -- GENERATED --
                  DATE: Sun Oct 16 22:49:22 AEDT 2016
                  SOURCE: C:/DL4J/Git/deeplearning4j/deeplearning4j-ui-parent/deeplearning4j-play/src/main/views/org/deeplearning4j/ui/views/training/Training.scala.html
                  HASH: 5eae0de0889cc65a280512b7e00cdd426791880b
                  MATRIX: 588->1|721->39|749->41|955->221|967->225|1017->255|1385->595|1414->596|1456->610|1508->635|1521->639|1575->672|1708->778|1737->779|1770->785|2283->1271|2296->1275|2351->1309|2592->1523|2605->1527|2660->1560|2907->1780|2920->1784|2974->1817|3020->1835|3197->1985|3210->1989|3265->2022|3513->2243|3526->2247|3577->2277|3623->2295|3802->2447|3815->2451|3870->2484|4119->2706|4132->2710|4182->2739|4228->2757|4403->2905|4416->2909|4471->2942|4718->3162|4731->3166|4781->3195|4827->3213|4924->3283|4937->3287|4991->3320|5118->3420|5132->3424|5197->3467|5579->3822|5592->3826|5649->3862|5696->3882|5709->3886|5771->3926
                  LINES: 20->1|25->1|26->2|29->5|29->5|29->5|37->13|37->13|38->14|38->14|38->14|38->14|41->17|41->17|42->18|54->30|54->30|54->30|58->34|58->34|58->34|62->38|62->38|62->38|63->39|65->41|65->41|65->41|69->45|69->45|69->45|70->46|72->48|72->48|72->48|76->52|76->52|76->52|77->53|79->55|79->55|79->55|83->59|83->59|83->59|84->60|86->62|86->62|86->62|87->63|87->63|87->63|94->70|94->70|94->70|94->70|94->70|94->70
                  -- GENERATED --
              */
          