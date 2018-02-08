package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso do tipo de campanha
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso do tipo de campanha")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoCampanhaResponse   {
  
  private Long id = null;
  private String descricao = null;

  
  /**
   * Identificador do tipo de campanha
   **/
  public TipoCampanhaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do tipo de campanha")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do tipo de campanha
   **/
  public TipoCampanhaResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do tipo de campanha")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoCampanhaResponse tipoCampanhaResponse = (TipoCampanhaResponse) o;
    return Objects.equals(this.id, tipoCampanhaResponse.id) &&
        Objects.equals(this.descricao, tipoCampanhaResponse.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoCampanhaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

