package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.PlanoCampanhaResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{campanha_response_description}}}
 **/

@ApiModel(description = "{{{campanha_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CampanhaResponse   {
  
  private Long id = null;
  private String nome = null;
  private Long idTipoCampanha = null;
  private List<PlanoCampanhaResponse> planosCampanhas = new ArrayList<PlanoCampanhaResponse>();

  
  /**
   * {{{campanha_response_id_value}}}
   **/
  public CampanhaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{campanha_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{campanha_response_nome_value}}}
   **/
  public CampanhaResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{campanha_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{campanha_response_id_tipo_campanha_value}}}
   **/
  public CampanhaResponse idTipoCampanha(Long idTipoCampanha) {
    this.idTipoCampanha = idTipoCampanha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{campanha_response_id_tipo_campanha_value}}}")
  @JsonProperty("idTipoCampanha")
  public Long getIdTipoCampanha() {
    return idTipoCampanha;
  }
  public void setIdTipoCampanha(Long idTipoCampanha) {
    this.idTipoCampanha = idTipoCampanha;
  }

  
  /**
   * {{{campanha_response_planos_campanhas_value}}}
   **/
  public CampanhaResponse planosCampanhas(List<PlanoCampanhaResponse> planosCampanhas) {
    this.planosCampanhas = planosCampanhas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{campanha_response_planos_campanhas_value}}}")
  @JsonProperty("planosCampanhas")
  public List<PlanoCampanhaResponse> getPlanosCampanhas() {
    return planosCampanhas;
  }
  public void setPlanosCampanhas(List<PlanoCampanhaResponse> planosCampanhas) {
    this.planosCampanhas = planosCampanhas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampanhaResponse campanhaResponse = (CampanhaResponse) o;
    return Objects.equals(this.id, campanhaResponse.id) &&
        Objects.equals(this.nome, campanhaResponse.nome) &&
        Objects.equals(this.idTipoCampanha, campanhaResponse.idTipoCampanha) &&
        Objects.equals(this.planosCampanhas, campanhaResponse.planosCampanhas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, idTipoCampanha, planosCampanhas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampanhaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    idTipoCampanha: ").append(toIndentedString(idTipoCampanha)).append("\n");
    sb.append("    planosCampanhas: ").append(toIndentedString(planosCampanhas)).append("\n");
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

