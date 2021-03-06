package fiber

import kotlinx.serialization.Optional
import kotlinx.serialization.Serializable

@Serializable
data class ConfigField(
    val name: String,
    val type: FieldType,
    @Optional val value: String? = null,
    @Optional val comment: String? = null,
    @Optional val constraints: List<Constraint> = listOf()
)