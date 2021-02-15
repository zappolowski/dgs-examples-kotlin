package com.example.demo.datafetchers

import com.example.demo.generated.DgsConstants
import com.example.demo.generated.types.ColorFilter
import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsData
import com.netflix.graphql.dgs.InputArgument

@DgsComponent
class ColorDataFetcher {
    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.Color)
    fun shows(@InputArgument("filter") filter: ColorFilter): String = filter.color ?: "Nothing provided"
}
