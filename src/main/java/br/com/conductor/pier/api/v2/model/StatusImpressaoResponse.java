package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{status_impressao_response_description}}}
 **/

@ApiModel(description = "{{{status_impressao_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class StatusImpressaoResponse   {
  
  private Long id = null;
  private String nome = null;

  
  /**
   * {{{status_impressao_response_id_value}}}
   **/
  public StatusImpressaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_impressao_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{status_impressao_response_nome_value}}}
   **/
  public StatusImpressaoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_impressao_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusImpressaoResponse statusImpressaoResponse = (StatusImpressaoResponse) o;
    return Objects.equals(this.id, statusImpressaoResponse.id) &&
        Objects.equals(this.nome, statusImpressaoResponse.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusImpressaoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
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



