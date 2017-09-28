package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.DocumentoDetalheResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta para o recurso de Documento
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta para o recurso de Documento")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DocumentoResponse   {
  
  private Long id = null;
  private Long idTipoDocumento = null;
  private Long idTemplateDocumento = null;
  private String nome = null;
  private String documento = null;
  private String extensao = null;
  private List<DocumentoDetalheResponse> documentoDetalhes = new ArrayList<DocumentoDetalheResponse>();

  
  /**
   * ID do Documento.
   **/
  public DocumentoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID do Documento.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * ID do Tipo de Documento associado.
   **/
  public DocumentoResponse idTipoDocumento(Long idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID do Tipo de Documento associado.")
  @JsonProperty("idTipoDocumento")
  public Long getIdTipoDocumento() {
    return idTipoDocumento;
  }
  public void setIdTipoDocumento(Long idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
  }

  
  /**
   * ID do Template de Documento associado.
   **/
  public DocumentoResponse idTemplateDocumento(Long idTemplateDocumento) {
    this.idTemplateDocumento = idTemplateDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID do Template de Documento associado.")
  @JsonProperty("idTemplateDocumento")
  public Long getIdTemplateDocumento() {
    return idTemplateDocumento;
  }
  public void setIdTemplateDocumento(Long idTemplateDocumento) {
    this.idTemplateDocumento = idTemplateDocumento;
  }

  
  /**
   * Nome do Documento.
   **/
  public DocumentoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Documento.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Nome do Documento.
   **/
  public DocumentoResponse documento(String documento) {
    this.documento = documento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Documento.")
  @JsonProperty("documento")
  public String getDocumento() {
    return documento;
  }
  public void setDocumento(String documento) {
    this.documento = documento;
  }

  
  /**
   * Extens\u00C3\u00A3o do Documento.
   **/
  public DocumentoResponse extensao(String extensao) {
    this.extensao = extensao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Extens\u00C3\u00A3o do Documento.")
  @JsonProperty("extensao")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * Detalhamento do documento.
   **/
  public DocumentoResponse documentoDetalhes(List<DocumentoDetalheResponse> documentoDetalhes) {
    this.documentoDetalhes = documentoDetalhes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detalhamento do documento.")
  @JsonProperty("documentoDetalhes")
  public List<DocumentoDetalheResponse> getDocumentoDetalhes() {
    return documentoDetalhes;
  }
  public void setDocumentoDetalhes(List<DocumentoDetalheResponse> documentoDetalhes) {
    this.documentoDetalhes = documentoDetalhes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoResponse documentoResponse = (DocumentoResponse) o;
    return Objects.equals(this.id, documentoResponse.id) &&
        Objects.equals(this.idTipoDocumento, documentoResponse.idTipoDocumento) &&
        Objects.equals(this.idTemplateDocumento, documentoResponse.idTemplateDocumento) &&
        Objects.equals(this.nome, documentoResponse.nome) &&
        Objects.equals(this.documento, documentoResponse.documento) &&
        Objects.equals(this.extensao, documentoResponse.extensao) &&
        Objects.equals(this.documentoDetalhes, documentoResponse.documentoDetalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoDocumento, idTemplateDocumento, nome, documento, extensao, documentoDetalhes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoDocumento: ").append(toIndentedString(idTipoDocumento)).append("\n");
    sb.append("    idTemplateDocumento: ").append(toIndentedString(idTemplateDocumento)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    documento: ").append(toIndentedString(documento)).append("\n");
    sb.append("    extensao: ").append(toIndentedString(extensao)).append("\n");
    sb.append("    documentoDetalhes: ").append(toIndentedString(documentoDetalhes)).append("\n");
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


