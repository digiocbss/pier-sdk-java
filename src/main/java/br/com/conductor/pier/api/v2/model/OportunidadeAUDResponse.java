package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.CdtDetalheOportunidadeAUD;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * {{{oportunidade_a_u_d_response_description}}}
 **/

@ApiModel(description = "{{{oportunidade_a_u_d_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OportunidadeAUDResponse   {
  
  private Long id = null;
  private Long idTipoOportunidade = null;
  private Long idStatusOportunidade = null;
  private String dataCadastro = null;
  private String dataAtualizacao = null;
  private String numeroReceitaFederal = null;
  private String dataInicioVigencia = null;
  private String dataFimVigencia = null;
  private Boolean flagAtivo = null;
  private List<CdtDetalheOportunidadeAUD> detalhes = new ArrayList<CdtDetalheOportunidadeAUD>();
  private String revDate = null;
  private Long revType = null;
  private Long rev = null;

  
  /**
   * {{{oportunidade_a_u_d_response_id_value}}}
   **/
  public OportunidadeAUDResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{oportunidade_a_u_d_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{oportunidade_a_u_d_response_id_tipo_oportunidade_value}}}
   **/
  public OportunidadeAUDResponse idTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{oportunidade_a_u_d_response_id_tipo_oportunidade_value}}}")
  @JsonProperty("idTipoOportunidade")
  public Long getIdTipoOportunidade() {
    return idTipoOportunidade;
  }
  public void setIdTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
  }

  
  /**
   * {{{oportunidade_a_u_d_response_id_status_oportunidade_value}}}
   **/
  public OportunidadeAUDResponse idStatusOportunidade(Long idStatusOportunidade) {
    this.idStatusOportunidade = idStatusOportunidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{oportunidade_a_u_d_response_id_status_oportunidade_value}}}")
  @JsonProperty("idStatusOportunidade")
  public Long getIdStatusOportunidade() {
    return idStatusOportunidade;
  }
  public void setIdStatusOportunidade(Long idStatusOportunidade) {
    this.idStatusOportunidade = idStatusOportunidade;
  }

  
  /**
   * {{{oportunidade_a_u_d_response_data_cadastro_value}}}
   **/
  public OportunidadeAUDResponse dataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{oportunidade_a_u_d_response_data_cadastro_value}}}")
  @JsonProperty("dataCadastro")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * {{{oportunidade_a_u_d_response_data_atualizacao_value}}}
   **/
  public OportunidadeAUDResponse dataAtualizacao(String dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{oportunidade_a_u_d_response_data_atualizacao_value}}}")
  @JsonProperty("dataAtualizacao")
  public String getDataAtualizacao() {
    return dataAtualizacao;
  }
  public void setDataAtualizacao(String dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
  }

  
  /**
   * {{{oportunidade_a_u_d_response_numero_receita_federal_value}}}
   **/
  public OportunidadeAUDResponse numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{oportunidade_a_u_d_response_numero_receita_federal_value}}}")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * {{{oportunidade_a_u_d_response_data_inicio_vigencia_value}}}
   **/
  public OportunidadeAUDResponse dataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{oportunidade_a_u_d_response_data_inicio_vigencia_value}}}")
  @JsonProperty("dataInicioVigencia")
  public String getDataInicioVigencia() {
    return dataInicioVigencia;
  }
  public void setDataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  
  /**
   * {{{oportunidade_a_u_d_response_data_fim_vigencia_value}}}
   **/
  public OportunidadeAUDResponse dataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{oportunidade_a_u_d_response_data_fim_vigencia_value}}}")
  @JsonProperty("dataFimVigencia")
  public String getDataFimVigencia() {
    return dataFimVigencia;
  }
  public void setDataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  
  /**
   * {{{oportunidade_a_u_d_response_flag_ativo_value}}}
   **/
  public OportunidadeAUDResponse flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{oportunidade_a_u_d_response_flag_ativo_value}}}")
  @JsonProperty("flagAtivo")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * {{{oportunidade_a_u_d_response_detalhes_value}}}
   **/
  public OportunidadeAUDResponse detalhes(List<CdtDetalheOportunidadeAUD> detalhes) {
    this.detalhes = detalhes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{oportunidade_a_u_d_response_detalhes_value}}}")
  @JsonProperty("detalhes")
  public List<CdtDetalheOportunidadeAUD> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<CdtDetalheOportunidadeAUD> detalhes) {
    this.detalhes = detalhes;
  }

  
  /**
   * {{{oportunidade_a_u_d_response_rev_date_value}}}
   **/
  public OportunidadeAUDResponse revDate(String revDate) {
    this.revDate = revDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{oportunidade_a_u_d_response_rev_date_value}}}")
  @JsonProperty("revDate")
  public String getRevDate() {
    return revDate;
  }
  public void setRevDate(String revDate) {
    this.revDate = revDate;
  }

  
  /**
   * {{{oportunidade_a_u_d_response_rev_type_value}}}
   **/
  public OportunidadeAUDResponse revType(Long revType) {
    this.revType = revType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{oportunidade_a_u_d_response_rev_type_value}}}")
  @JsonProperty("revType")
  public Long getRevType() {
    return revType;
  }
  public void setRevType(Long revType) {
    this.revType = revType;
  }

  
  /**
   * {{{oportunidade_a_u_d_response_rev_value}}}
   **/
  public OportunidadeAUDResponse rev(Long rev) {
    this.rev = rev;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{oportunidade_a_u_d_response_rev_value}}}")
  @JsonProperty("rev")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OportunidadeAUDResponse oportunidadeAUDResponse = (OportunidadeAUDResponse) o;
    return Objects.equals(this.id, oportunidadeAUDResponse.id) &&
        Objects.equals(this.idTipoOportunidade, oportunidadeAUDResponse.idTipoOportunidade) &&
        Objects.equals(this.idStatusOportunidade, oportunidadeAUDResponse.idStatusOportunidade) &&
        Objects.equals(this.dataCadastro, oportunidadeAUDResponse.dataCadastro) &&
        Objects.equals(this.dataAtualizacao, oportunidadeAUDResponse.dataAtualizacao) &&
        Objects.equals(this.numeroReceitaFederal, oportunidadeAUDResponse.numeroReceitaFederal) &&
        Objects.equals(this.dataInicioVigencia, oportunidadeAUDResponse.dataInicioVigencia) &&
        Objects.equals(this.dataFimVigencia, oportunidadeAUDResponse.dataFimVigencia) &&
        Objects.equals(this.flagAtivo, oportunidadeAUDResponse.flagAtivo) &&
        Objects.equals(this.detalhes, oportunidadeAUDResponse.detalhes) &&
        Objects.equals(this.revDate, oportunidadeAUDResponse.revDate) &&
        Objects.equals(this.revType, oportunidadeAUDResponse.revType) &&
        Objects.equals(this.rev, oportunidadeAUDResponse.rev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoOportunidade, idStatusOportunidade, dataCadastro, dataAtualizacao, numeroReceitaFederal, dataInicioVigencia, dataFimVigencia, flagAtivo, detalhes, revDate, revType, rev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OportunidadeAUDResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoOportunidade: ").append(toIndentedString(idTipoOportunidade)).append("\n");
    sb.append("    idStatusOportunidade: ").append(toIndentedString(idStatusOportunidade)).append("\n");
    sb.append("    dataCadastro: ").append(toIndentedString(dataCadastro)).append("\n");
    sb.append("    dataAtualizacao: ").append(toIndentedString(dataAtualizacao)).append("\n");
    sb.append("    numeroReceitaFederal: ").append(toIndentedString(numeroReceitaFederal)).append("\n");
    sb.append("    dataInicioVigencia: ").append(toIndentedString(dataInicioVigencia)).append("\n");
    sb.append("    dataFimVigencia: ").append(toIndentedString(dataFimVigencia)).append("\n");
    sb.append("    flagAtivo: ").append(toIndentedString(flagAtivo)).append("\n");
    sb.append("    detalhes: ").append(toIndentedString(detalhes)).append("\n");
    sb.append("    revDate: ").append(toIndentedString(revDate)).append("\n");
    sb.append("    revType: ").append(toIndentedString(revType)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
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



