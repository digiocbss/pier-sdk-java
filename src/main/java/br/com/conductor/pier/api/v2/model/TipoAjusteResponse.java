package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.TipoTransacaoAjusteResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{tipo_ajuste_response_description}}}
 **/

@ApiModel(description = "{{{tipo_ajuste_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoAjusteResponse   {
  
  private Long id = null;
  private String descricao = null;
  private List<TipoTransacaoAjusteResponse> transacoes = new ArrayList<TipoTransacaoAjusteResponse>();

  
  /**
   * {{{tipo_ajuste_response_id_value}}}
   **/
  public TipoAjusteResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_ajuste_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{tipo_ajuste_response_descricao_value}}}
   **/
  public TipoAjusteResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_ajuste_response_descricao_value}}}")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{tipo_ajuste_response_transacoes_value}}}
   **/
  public TipoAjusteResponse transacoes(List<TipoTransacaoAjusteResponse> transacoes) {
    this.transacoes = transacoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_ajuste_response_transacoes_value}}}")
  @JsonProperty("transacoes")
  public List<TipoTransacaoAjusteResponse> getTransacoes() {
    return transacoes;
  }
  public void setTransacoes(List<TipoTransacaoAjusteResponse> transacoes) {
    this.transacoes = transacoes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoAjusteResponse tipoAjusteResponse = (TipoAjusteResponse) o;
    return Objects.equals(this.id, tipoAjusteResponse.id) &&
        Objects.equals(this.descricao, tipoAjusteResponse.descricao) &&
        Objects.equals(this.transacoes, tipoAjusteResponse.transacoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, transacoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoAjusteResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    transacoes: ").append(toIndentedString(transacoes)).append("\n");
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

