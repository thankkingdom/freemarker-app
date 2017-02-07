<#ftl output_format="HTML" auto_esc=true>
<#assign campaignTitles = ''>
<#assign campaignTitles = campaignTitles + "●" +campaignTitle1>
<#assign campaignTitles = campaignTitles + '|||' + "●" +campaignTitle2>
<span style="color:red;">${campaignTitles?replace('|||', ' <br> ')?no_esc} </span>