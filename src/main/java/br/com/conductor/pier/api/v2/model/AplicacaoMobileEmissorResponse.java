package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{aplicacao_mobile_emissor_resposta_descricao}}}
 **/

@ApiModel(description = "{{{aplicacao_mobile_emissor_resposta_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AplicacaoMobileEmissorResponse   {
  
  private Long id = null;

  
  /**
   * {{{aplicacao_mobile_emissor_resposta_id_descricao}}}
   **/
  public AplicacaoMobileEmissorResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aplicacao_mobile_emissor_resposta_id_descricao}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AplicacaoMobileEmissorResponse aplicacaoMobileEmissorResponse = (AplicacaoMobileEmissorResponse) o;
    return Objects.equals(this.id, aplicacaoMobileEmissorResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoMobileEmissorResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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



