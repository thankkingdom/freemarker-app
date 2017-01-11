<#list menu as food>
${food.name} ${food.price?string.currency}
</#list>

<#list menu>
<#items as food>
${food.name} ${food.price?string.currency}
</#items>
</#list>