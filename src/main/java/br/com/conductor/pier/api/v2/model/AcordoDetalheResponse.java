package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto Acordo detalhado
 **/

@ApiModel(description = "Objeto Acordo detalhado")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AcordoDetalheResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Long statusAcordo = null;
  private BigDecimal valorAcordo = null;
  private String dataAcordo = null;
  private Integer quantidadeParcelas = null;
  private BigDecimal saldoAtualFinal = null;
  private Integer diasEmAtraso = null;
  private Long statusConta = null;
  private String assessoriaAtual = null;
  private BigDecimal totalPagamentos = null;
  private String dataVencimentoCobranca = null;
  private String dataQuebraAcordo = null;
  private BigDecimal valorParcela1 = null;
  private BigDecimal valorParcelaN = null;
  private Integer parcelaPedida = null;
  private String vencimentoParcelaPedida = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do acordo (id).
   **/
  public AcordoDetalheResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do acordo (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da conta.
   **/
  public AcordoDetalheResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da conta.")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Status do acordo.
   **/
  public AcordoDetalheResponse statusAcordo(Long statusAcordo) {
    this.statusAcordo = statusAcordo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status do acordo.")
  @JsonProperty("statusAcordo")
  public Long getStatusAcordo() {
    return statusAcordo;
  }
  public void setStatusAcordo(Long statusAcordo) {
    this.statusAcordo = statusAcordo;
  }

  
  /**
   * Valor do Acordo.
   **/
  public AcordoDetalheResponse valorAcordo(BigDecimal valorAcordo) {
    this.valorAcordo = valorAcordo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do Acordo.")
  @JsonProperty("valorAcordo")
  public BigDecimal getValorAcordo() {
    return valorAcordo;
  }
  public void setValorAcordo(BigDecimal valorAcordo) {
    this.valorAcordo = valorAcordo;
  }

  
  /**
   * Data e Hora do acordo.
   **/
  public AcordoDetalheResponse dataAcordo(String dataAcordo) {
    this.dataAcordo = dataAcordo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e Hora do acordo.")
  @JsonProperty("dataAcordo")
  public String getDataAcordo() {
    return dataAcordo;
  }
  public void setDataAcordo(String dataAcordo) {
    this.dataAcordo = dataAcordo;
  }

  
  /**
   * Quantidade de parcelas do acordo.
   **/
  public AcordoDetalheResponse quantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de parcelas do acordo.")
  @JsonProperty("quantidadeParcelas")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Saldo atual final.
   **/
  public AcordoDetalheResponse saldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo atual final.")
  @JsonProperty("saldoAtualFinal")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * Dias em atraso.
   **/
  public AcordoDetalheResponse diasEmAtraso(Integer diasEmAtraso) {
    this.diasEmAtraso = diasEmAtraso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dias em atraso.")
  @JsonProperty("diasEmAtraso")
  public Integer getDiasEmAtraso() {
    return diasEmAtraso;
  }
  public void setDiasEmAtraso(Integer diasEmAtraso) {
    this.diasEmAtraso = diasEmAtraso;
  }

  
  /**
   * Status da conta.
   **/
  public AcordoDetalheResponse statusConta(Long statusConta) {
    this.statusConta = statusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status da conta.")
  @JsonProperty("statusConta")
  public Long getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(Long statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * Assessoria atual.
   **/
  public AcordoDetalheResponse assessoriaAtual(String assessoriaAtual) {
    this.assessoriaAtual = assessoriaAtual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Assessoria atual.")
  @JsonProperty("assessoriaAtual")
  public String getAssessoriaAtual() {
    return assessoriaAtual;
  }
  public void setAssessoriaAtual(String assessoriaAtual) {
    this.assessoriaAtual = assessoriaAtual;
  }

  
  /**
   * Total de pagamentos.
   **/
  public AcordoDetalheResponse totalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total de pagamentos.")
  @JsonProperty("totalPagamentos")
  public BigDecimal getTotalPagamentos() {
    return totalPagamentos;
  }
  public void setTotalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
  }

  
  /**
   * Data do vencimento da cobran\u00E7a.
   **/
  public AcordoDetalheResponse dataVencimentoCobranca(String dataVencimentoCobranca) {
    this.dataVencimentoCobranca = dataVencimentoCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data do vencimento da cobran\u00E7a.")
  @JsonProperty("dataVencimentoCobranca")
  public String getDataVencimentoCobranca() {
    return dataVencimentoCobranca;
  }
  public void setDataVencimentoCobranca(String dataVencimentoCobranca) {
    this.dataVencimentoCobranca = dataVencimentoCobranca;
  }

  
  /**
   * Data da quebra do acordo.
   **/
  public AcordoDetalheResponse dataQuebraAcordo(String dataQuebraAcordo) {
    this.dataQuebraAcordo = dataQuebraAcordo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da quebra do acordo.")
  @JsonProperty("dataQuebraAcordo")
  public String getDataQuebraAcordo() {
    return dataQuebraAcordo;
  }
  public void setDataQuebraAcordo(String dataQuebraAcordo) {
    this.dataQuebraAcordo = dataQuebraAcordo;
  }

  
  /**
   * Valor da parcela 1.
   **/
  public AcordoDetalheResponse valorParcela1(BigDecimal valorParcela1) {
    this.valorParcela1 = valorParcela1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da parcela 1.")
  @JsonProperty("valorParcela1")
  public BigDecimal getValorParcela1() {
    return valorParcela1;
  }
  public void setValorParcela1(BigDecimal valorParcela1) {
    this.valorParcela1 = valorParcela1;
  }

  
  /**
   * Valor da parcela N.
   **/
  public AcordoDetalheResponse valorParcelaN(BigDecimal valorParcelaN) {
    this.valorParcelaN = valorParcelaN;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da parcela N.")
  @JsonProperty("valorParcelaN")
  public BigDecimal getValorParcelaN() {
    return valorParcelaN;
  }
  public void setValorParcelaN(BigDecimal valorParcelaN) {
    this.valorParcelaN = valorParcelaN;
  }

  
  /**
   * Parcela pedida.
   **/
  public AcordoDetalheResponse parcelaPedida(Integer parcelaPedida) {
    this.parcelaPedida = parcelaPedida;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parcela pedida.")
  @JsonProperty("parcelaPedida")
  public Integer getParcelaPedida() {
    return parcelaPedida;
  }
  public void setParcelaPedida(Integer parcelaPedida) {
    this.parcelaPedida = parcelaPedida;
  }

  
  /**
   * Data de vencimento da parcela pedida.
   **/
  public AcordoDetalheResponse vencimentoParcelaPedida(String vencimentoParcelaPedida) {
    this.vencimentoParcelaPedida = vencimentoParcelaPedida;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento da parcela pedida.")
  @JsonProperty("vencimentoParcelaPedida")
  public String getVencimentoParcelaPedida() {
    return vencimentoParcelaPedida;
  }
  public void setVencimentoParcelaPedida(String vencimentoParcelaPedida) {
    this.vencimentoParcelaPedida = vencimentoParcelaPedida;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcordoDetalheResponse acordoDetalheResponse = (AcordoDetalheResponse) o;
    return Objects.equals(this.id, acordoDetalheResponse.id) &&
        Objects.equals(this.idConta, acordoDetalheResponse.idConta) &&
        Objects.equals(this.statusAcordo, acordoDetalheResponse.statusAcordo) &&
        Objects.equals(this.valorAcordo, acordoDetalheResponse.valorAcordo) &&
        Objects.equals(this.dataAcordo, acordoDetalheResponse.dataAcordo) &&
        Objects.equals(this.quantidadeParcelas, acordoDetalheResponse.quantidadeParcelas) &&
        Objects.equals(this.saldoAtualFinal, acordoDetalheResponse.saldoAtualFinal) &&
        Objects.equals(this.diasEmAtraso, acordoDetalheResponse.diasEmAtraso) &&
        Objects.equals(this.statusConta, acordoDetalheResponse.statusConta) &&
        Objects.equals(this.assessoriaAtual, acordoDetalheResponse.assessoriaAtual) &&
        Objects.equals(this.totalPagamentos, acordoDetalheResponse.totalPagamentos) &&
        Objects.equals(this.dataVencimentoCobranca, acordoDetalheResponse.dataVencimentoCobranca) &&
        Objects.equals(this.dataQuebraAcordo, acordoDetalheResponse.dataQuebraAcordo) &&
        Objects.equals(this.valorParcela1, acordoDetalheResponse.valorParcela1) &&
        Objects.equals(this.valorParcelaN, acordoDetalheResponse.valorParcelaN) &&
        Objects.equals(this.parcelaPedida, acordoDetalheResponse.parcelaPedida) &&
        Objects.equals(this.vencimentoParcelaPedida, acordoDetalheResponse.vencimentoParcelaPedida);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, statusAcordo, valorAcordo, dataAcordo, quantidadeParcelas, saldoAtualFinal, diasEmAtraso, statusConta, assessoriaAtual, totalPagamentos, dataVencimentoCobranca, dataQuebraAcordo, valorParcela1, valorParcelaN, parcelaPedida, vencimentoParcelaPedida);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcordoDetalheResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    statusAcordo: ").append(toIndentedString(statusAcordo)).append("\n");
    sb.append("    valorAcordo: ").append(toIndentedString(valorAcordo)).append("\n");
    sb.append("    dataAcordo: ").append(toIndentedString(dataAcordo)).append("\n");
    sb.append("    quantidadeParcelas: ").append(toIndentedString(quantidadeParcelas)).append("\n");
    sb.append("    saldoAtualFinal: ").append(toIndentedString(saldoAtualFinal)).append("\n");
    sb.append("    diasEmAtraso: ").append(toIndentedString(diasEmAtraso)).append("\n");
    sb.append("    statusConta: ").append(toIndentedString(statusConta)).append("\n");
    sb.append("    assessoriaAtual: ").append(toIndentedString(assessoriaAtual)).append("\n");
    sb.append("    totalPagamentos: ").append(toIndentedString(totalPagamentos)).append("\n");
    sb.append("    dataVencimentoCobranca: ").append(toIndentedString(dataVencimentoCobranca)).append("\n");
    sb.append("    dataQuebraAcordo: ").append(toIndentedString(dataQuebraAcordo)).append("\n");
    sb.append("    valorParcela1: ").append(toIndentedString(valorParcela1)).append("\n");
    sb.append("    valorParcelaN: ").append(toIndentedString(valorParcelaN)).append("\n");
    sb.append("    parcelaPedida: ").append(toIndentedString(parcelaPedida)).append("\n");
    sb.append("    vencimentoParcelaPedida: ").append(toIndentedString(vencimentoParcelaPedida)).append("\n");
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

