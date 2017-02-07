<#ftl output_format="HTML" auto_esc=true>
[${v!}]
[${v!?esc}]
[${(v!)?esc}]
<#assign qs = "?a=1&b=2" />
<#macro makeSearchUrlAnyDir queryString dirName=''>
	<#if qs?c >
		${"A"}
	<#else>
		${"B"}
	</#if>
</#macro>
<@makeSearchUrlAnyDir qs />